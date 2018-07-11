package akshay.actvtest

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dial.*

class DialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dial)

        b1.setOnClickListener({
            val a = Intent()
            a.action = Intent.ACTION_DIAL
            a.data = Uri.parse("tel:"+et1.text.toString())
            startActivity(a)
        })
    }
}
