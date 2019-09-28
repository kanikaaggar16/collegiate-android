package com.example.demo.collegiate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registeration extends AppCompatActivity {
    private FirebaseAuth mAuth;

    private FirebaseAuth.AuthStateListener mAuthListener;
    private EditText emailt , passwordt ;
    private Button register , signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        emailt = (EditText)findViewById(R.id.edit_text1);
        passwordt = (EditText)findViewById(R.id.edit_text2);
        signin = (Button)findViewById(R.id.sign_up);
        register = (Button)findViewById(R.id.register_button);
        mAuth = FirebaseAuth.getInstance();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailt.getText().toString();
                String password = passwordt.getText().toString();
                if(email.isEmpty())
                {
                    emailt.setError("Please enter email");
                    emailt.requestFocus();
                }
                else if(password.isEmpty())
                {
                    emailt.setError("Please enter email");
                    emailt.requestFocus();
                }
                else if(email.isEmpty() && password.isEmpty())
                {
                    Toast.makeText(registeration.this,"Please fill the fields",Toast.LENGTH_SHORT).show();
                }
                else if(!(email.isEmpty() && password.isEmpty()))
                {
                    mAuth.createUserWithEmailAndPassword(email , password).addOnCompleteListener(registeration.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                Toast.makeText(registeration.this,"Sign in successful",Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(registeration.this,MainActivity.class));
                            }
                            else
                            {
                                Toast.makeText(registeration.this,"Sign in successful",Toast.LENGTH_SHORT).show();
                                //startActivity(new Intent(registeration.this,MainActivity.class));
                            }
                        }
                    });
                }
               else
                {
                    Toast.makeText(registeration.this,"Error Occurred",Toast.LENGTH_SHORT).show();
                }
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(registeration.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
