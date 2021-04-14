package com.example.myfit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;
import java.util.Objects;

public class Recommendation extends AppCompatActivity {
    Button calc_btn;
    TextView a, b, c, d, e, f;
    EditText p, q, r, s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.cal_recommendation);

        calc_btn = findViewById(R.id.calculate_btn);
        a = findViewById(R.id.cal_maintain);
        b = findViewById(R.id.cal_bulk);
        c = findViewById(R.id.cal_cut);
        d = findViewById(R.id.mac_protein);
        e = findViewById(R.id.mac_carb);
        f = findViewById(R.id.mac_fat);
        p=findViewById(R.id.editAge);
        q=findViewById(R.id.editHeight);
        r=findViewById(R.id.editWeight);
        s=findViewById(R.id.editGender);


        calc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                a.setText("2000");
                b.setText("2500");
                c.setText("1750");
                d.setText("124");
                e.setText("188");
                f.setText("65");

            }
        });
    }

    private void noUse()
    {
        a.setText(null);
        b.setText(null);
        c.setText(null);
        d.setText(null);
        e.setText(null);
        f.setText(null);
    }

    private void femaleCheck() {
        double wt1 = Double.parseDouble(r.getText().toString());
        double ht1 = Double.parseDouble(q.getText().toString());
        double age1 = Double.parseDouble(p.getText().toString());
        double formula2, formula3, formula4, formula5,formula6, result, bulk, cut, protein, carbohydrates, fat;
        formula3 = 1.9 * ht1;
        formula5 = 4.7*age1;
        formula4 = formula3/formula5;
        formula6 = 9.6 * wt1;
        formula2 = 665.1 + formula6 + formula4;
        result = formula2 * 1.3;
        a.setText((int) result);
        bulk = result + 400;
        b.setText((int) bulk);
        cut = result - 400;
        c.setText((int) cut);
        protein = (0.4 * result) / 4;
        d.setText((int) protein);
        carbohydrates = (0.6 * result) / 4;
        e.setText((int) carbohydrates);
        fat = (0.2 * result) / 9;
        f.setText((int) fat);

    }

    private void malecheck()
    {
        double wt1 = Double.parseDouble(r.getText().toString());
        double ht1 = Double.parseDouble(q.getText().toString());
        double age1 = Double.parseDouble(p.getText().toString());
        double formula2, formula3, formula4, formula5,formula6, result, bulk, cut, protein, carbohydrates, fat;
        formula6 = 13.8 * wt1;
        formula4 = 6.8*age1;
        formula3 = 5*ht1;
        formula5 = formula3/formula4;
        formula2 = 66.5 + formula6 + formula5;
        result = formula2 * 1.3;
        a.setText((int) result);
        bulk = result + 500;
        b.setText((int) bulk);
        cut = result - 500;
        c.setText((int) cut);
        protein = (0.4 * result) / 4;
        d.setText((int) protein);
        carbohydrates = (0.6 * result) / 4;
        e.setText((int) carbohydrates);
        fat = (0.2 * result) / 9;
        f.setText((int) fat);
    }
}




/*              String gender = s.getText().toString();
                if (gender.equalsIgnoreCase("M"))
                {malecheck();}
                else if (gender.equalsIgnoreCase("F"))
                {femaleCheck();}
                else
                {noUse();}

 */

