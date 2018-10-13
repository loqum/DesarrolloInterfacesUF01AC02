package rfm.com.desarrollointerfacesuf01ac02;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    private TextInputLayout textInputName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        textInputName = findViewById(R.id.text_input_name);
    }

    public boolean validateName() throws NullPointerException {
        String nameInput;

        try {
            nameInput = textInputName.getEditText().getText().toString().trim();
        } catch (NullPointerException e) {
            throw e;
        }

        if(nameInput.isEmpty()) {
            textInputName.setError("El campo no puede estar vacío");
            return false;
        } else {
            textInputName.setError(null);
            return true;
        }
    }

    public void aceptarInput(View view) throws NullPointerException {
        if (!validateName()) {
            return;
        }

        String input;

        try {
            input = "Nombre: " + textInputName.getEditText().getText().toString();
        } catch (NullPointerException e2) {
            throw e2;
        }

        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();

    }
}
