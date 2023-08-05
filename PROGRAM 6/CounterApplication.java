public class MainActivity extends AppCompatActivity {
    Button btnstart,btnstop;
    TextView tv;
    int i=1;
    Handler custmHander=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnstart=findViewById(R.id.button1);
        btnstop=findViewById(R.id.button2);
        tv=findViewById(R.id.textView);
        
        btnstart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                custmHander.postDelayed(updateTimerThread,0);
            }
        });

        btnstop.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                custmHander.removeCallbacks(updateTimerThread);
            }
        });
    }
    
    private final Runnable updateTimerThread = new Runnable() {
        @Override
        public void run() {
            tv.setText("" + i);
            custmHander.postDelayed(this, 1000);
            i++;
        }
    };
}
