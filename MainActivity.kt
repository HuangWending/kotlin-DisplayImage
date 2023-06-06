import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagePath = "您的图片文件路径" // 图像文件的路径

        val imageView = findViewById<ImageView>(R.id.imageView) // 获取ImageView组件实例
        imageView.setImageURI(android.net.Uri.parse(imagePath)) // 使用图像路径设置ImageView的图像
    }
}
