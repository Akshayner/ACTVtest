package akshay.actvtest

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val values = arrayOf("India","Indonesia","Australia","United States","Bhutan","Sri Lanka")
        val mya = ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,values)
        actv.setAdapter(mya)
        actv.threshold = 1

        b1.setOnClickListener({
        val a = Intent(this,WelcomeActivity::class.java)
            a.putExtra("country",actv.text.toString())
            startActivity(a)
        })

        b2.setOnClickListener({
            val b = packageManager.getLaunchIntentForPackage("com.whatsapp")
            if(b==null){
                val c = Intent()
                c.action = Intent.ACTION_VIEW
                c.data = Uri.parse("http://whatsapp.com")
                startActivity(c)
            }
            else{
                startActivity(b)
            }
        })

        b3.setOnClickListener({
            val e = Intent(this,CopyActivity::class.java)
            startActivity(e)
        })

        b4.setOnClickListener({
            val d = Intent(this,DialActivity::class.java)
            startActivity(d)
        })
    }
}
