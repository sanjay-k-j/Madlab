public class MainActivity extends AppCompatActivity {
Spinner inputSpinner;
Spinner outputSpinner;
EditText inputEditText;
Button b;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputSpinner=findViewById(R.id.input_spinner);
        outputSpinner=findViewById(R.id.output_spinner);
        inputEditText=findViewById(R.id.input_editText);
        b=findViewById(R.id.button);
        tv=findViewById(R.id.output_textView);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertCurrency();
            }
        });
    }
    public void convertCurrency(){
        String inputCurrency=inputSpinner.getSelectedItem().toString();
        String outputCurrency=outputSpinner.getSelectedItem().toString();
        double inputAmount=Double.parseDouble(inputEditText.getText().toString());
        double usdAmount=0.0;
        switch (inputCurrency){
            case "USD":
                usdAmount=inputAmount;
                break;
            case "EUR":
                usdAmount=inputAmount*1.18;
                break;
            case "JPY":
                usdAmount=inputAmount*0.0091;
                break;
        }
        double outputAmount=0.0;
        switch (outputCurrency){
            case "USD":
                outputAmount=usdAmount;
                break;
            case "EUR":
                outputAmount=usdAmount/1.18;
                break;
            case "JPY":
                outputAmount=usdAmount/0.0091;
                break;
        }
        tv.setText(String.format("%.2f",outputAmount)+""+outputCurrency);
    }
}
