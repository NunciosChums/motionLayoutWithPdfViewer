package kr.susemi99.pdfviewscroll

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kr.susemi99.pdfviewscroll.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
  private lateinit var binding: MainActivityBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = MainActivityBinding.inflate(layoutInflater).also {
      setContentView(it.root)
    }

    binding.pdfViewer.fromAsset("hola_isic_card.pdf")
      .autoSpacing(true)
      .enableAntialiasing(true)
      .load()

//    binding.pdfViewer.fromAsset("hola_isic_card.pdf").show()

//    binding.pdfViewer.initWithUrl("https://www.hyundaicard.com/images/popup/p_DB.pdf")
  }
}