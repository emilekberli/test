package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private var currentIndex = 0
    private val images = arrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3)
    private val titles = arrayOf("Odaklanmanın Gücü", "Kendi Ritmini Yarat", "Verimli Mola Zamanı")
    private val texts = arrayOf(
        "Günlük işlerinize daha verimli odaklanmak için kısa süreli çalışma seansları düzenleyin. Pomodoro tekniği ile kısa aralıklarla çalışarak dikkatinizi toplu tutabilir, molalarla zihninizi dinlendirebilirsiniz.",
        "Her bireyin odaklanma süresi farklıdır. Çalışma seanslarınızı kişisel ihtiyaçlarınıza göre özelleştirin. İster 25 dakika çalışıp 5 dakika mola verin, ister daha uzun çalışma seansları tercih edin.",
        "Çalışmanın yanı sıra, kaliteli molalar vermek de çok önemlidir. Molalarınızda rahatlayın, hareket edin veya zihninizi boşaltın. Bu, bir sonraki çalışma seansınıza daha zinde başlamanızı sağlar."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val imageView = findViewById<ImageView>(R.id.imageViewIntro)
        val titleView = findViewById<TextView>(R.id.textViewTitle)
        val textView = findViewById<TextView>(R.id.textViewDescription)
        val nextButton = findViewById<Button>(R.id.nextButton)


        imageView.setImageResource(images[currentIndex])
        titleView.text = titles[currentIndex]
        textView.text = texts[currentIndex]

        nextButton.setOnClickListener {
            if (currentIndex == 2) {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            } else {
                currentIndex = (currentIndex + 1) % images.size
                imageView.setImageResource(images[currentIndex])
                titleView.text = titles[currentIndex]
                textView.text = texts[currentIndex]
            }
        }

    }
}