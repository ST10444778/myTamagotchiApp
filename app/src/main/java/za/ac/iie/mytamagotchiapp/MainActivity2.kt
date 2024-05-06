package za.ac.iie.mytamagotchiapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    private var petHappy = 100
    private var petHungry = 50
    private var petClean =  50
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        // we are now declaring the buttons and text views
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val txtClean = findViewById<TextView>(R.id.txtClean)
        val txtHungry = findViewById<TextView>(R.id.txtHungry)
        val txtHappy = findViewById<TextView>(R.id.txtHappy)
        val petImage2 = findViewById<ImageView>(R.id.petImage2)

        // we are now initializing the first text values and turning them to strings
        txtHungry.setText(petHungry.toString())
        txtClean.setText(petClean.toString())
        txtHappy.setText(petHappy.toString())

        // now we ar using the buttons
        btnFeed.setOnClickListener {
            petHungry += 10
            petHappy += 5
            petClean += 5
            txtHungry.setText(petHungry.toString())
            animateImageChange(petImage2, R.drawable.image3)


        }

        btnPlay.setOnClickListener {
            petHungry += 5
            petHappy += 10
            petClean += 5
            txtHappy.setText(petHappy.toString())
            animateImageChange(petImage2, R.drawable.image2)

        }

        btnClean.setOnClickListener {
            petClean += 10
            petHappy += 2

            txtClean.setText(petClean.toString())
            animateImageChange(petImage2, R.drawable.image1)

        }


    }

    private fun animateImageChange(petImage2: ImageView?, image3: Int) {

    }

}