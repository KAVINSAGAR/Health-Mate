package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.borjabravo.readmoretextview.ReadMoreTextView;

import java.util.ArrayList;

public class MedicineActivity extends AppCompatActivity {

    private ArrayList<ExampleItem> mList;
    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        createExampleList();
        buildRecyclerView();


        EditText editText = findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

    }
    private void filter(String text) {
        ArrayList<ExampleItem> filteredList = new ArrayList<>();

        for (ExampleItem item : mList) {
            if (item.getText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        mAdapter.filterList(filteredList);
    }
    private void createExampleList() {
        mList = new ArrayList<>();
        mList.add(new ExampleItem("Remdesivir","Remdesivir is an investigational drug being studied to treat coronavirus infection, also known as COVID-19. It has not been approved by the FDA for general use. However, the FDA is now allowing remdesivir to be used in human studies and for emergency use in certain hospitalized patients."));

        mList.add(new ExampleItem("Dexamethasone","Dexamethasone is a corticosteroid used in a wide range of conditions for its anti-inflammatory and immunosuppressant effects.\n" +
                "\n" +
                "It was tested in hospitalized patients with COVID-19 in the United Kingdom’s national clinical trial RECOVERY and was found to have benefits for critically ill patients.\n" +
                "\n" +
                "According to preliminary findings shared with WHO (and now available as a preprint), for patients on ventilators, the treatment was shown to reduce mortality by about one third, and for patients requiring only oxygen, mortality was cut by about one fifth."));

        mList.add(new ExampleItem("Bamlanivimab","Bamlanivimab was first granted emergency use authorization in November as a monotherapy for treatment of mild to moderate COVID-19 in adults and pediatric patients at high risk for progressing to severe COVID-19 and/or hospitalization."));

        mList.add(new ExampleItem("Azithromycin","Azithromycin is an antibiotic. It's widely used to treat chest infections such as pneumonia, infections of the nose and throat such as sinus infection (sinusitis), skin infections, Lyme disease, and some sexually transmitted infections.\n" +
                "\n" +
                "Azithromycin is used in children, often to treat ear infections or chest infections.It can also be used long term to prevent chest infections in people who keep getting them.\n" +
                "\n" +
                "The medicine is available on prescription as capsules, tablets and a liquid that you drink. It can also be given by injection, but this is usually only done in hospital."));

        mList.add(new ExampleItem("Tocilizumab ","Tocilizumab is used alone or with other medications to treat moderate to severe rheumatoid arthritis in adults. It is also used to treat rheumatoid arthritis in children (such as polyarticular juvenile idiopathic arthritis-PJIA, systemic juvenile idiopathic arthritis-SJIA). It helps to reduce pain and swelling due to rheumatoid arthritis. Tocilizumab is also used to treat giant cell arteritis. It helps to reduce swelling in your blood vessels so blood can flow more easily."));

        mList.add(new ExampleItem("Ivermectin","Ivermectin is used to treat certain parasitic roundworm infections. Curing parasitic infections helps to improve your quality of life. In people with weakened defense (immune) systems, curing roundworm infections can reduce the risk of developing a severe or life-threatening infection. Ivermectin belongs to a class of drugs known as antihelmintics. It works by paralyzing and killing parasites."));

        mList.add(new ExampleItem("Tamiflu","Tamiflu is used to treat symptoms caused by the flu virus (influenza). It helps make the symptoms (such as stuffy nose, cough, sore throat, fever/chills, aches, tiredness) less severe and shortens the recovery time by 1-2 days.This medication may also be used to prevent the flu if you have been exposed to someone who already has the flu (such as a sick household member) or if there is a flu outbreak in the community.This medication works by stopping the flu virus from growing."));
    }

    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        Spacing itemdec=new Spacing(50);
        mRecyclerView.addItemDecoration(itemdec);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
