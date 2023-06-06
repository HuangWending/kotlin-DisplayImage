# kotlin-DisplayImage
Kotlin显示路径图片的程序
import javax.swing.ImageIcon 和 import javax.swing.JFrame：导入需要使用的 Swing 组件类。
fun main() { ... }：程序的入口点，从这里开始执行。
val imagePath = "您的图片文件路径"：将图像文件的路径存储在名为 imagePath 的字符串变量中，您需要将实际的图片文件路径替换为 "您的图片文件路径"。
val frame = JFrame()：创建一个 JFrame 对象，用于显示图像。
val imageIcon = ImageIcon(imagePath)：创建一个 ImageIcon 对象，用于加载指定路径的图像。
val label = JLabel(imageIcon)：创建一个 JLabel 对象，并将图像添加到标签上。
frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE：设置当用户关闭窗口时程序会退出。
frame.contentPane.add(label)：将标签添加到窗口的内容面板中，以显示图像。
frame.pack()：根据图像的大小调整窗口的大小，以适应图像的尺寸。
frame.isVisible = true：将窗口设置为可见，显示图像。
<ImageView：这是一个ImageView组件的开始标签，表示在布局中创建一个图像视图。
android:id="@+id/imageView"：这是ImageView组件的唯一标识符，它可以在代码中用来引用该组件。
android:layout_width="match_parent"：这是ImageView的宽度属性，设置为"match_parent"表示宽度应填满其父布局的可用空间。
android:layout_height="match_parent"：这是ImageView的高度属性，设置为"match_parent"表示高度应填满其父布局的可用空间。
/ >：这是ImageView组件的结束标签，表示ImageView组件的定义结束。
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle：导入Android的Bundle类，用于存储和传递活动状态的数据。
import android.widget.ImageView：导入Android的ImageView类，用于显示图像。
import androidx.appcompat.app.AppCompatActivity：导入AndroidX的AppCompatActivity类，它是一个兼容旧版本Android的活动基类。
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
class MainActivity : AppCompatActivity()：创建一个名为MainActivity的类，并继承自AppCompatActivity类，表示这是一个活动类。
override fun onCreate(savedInstanceState: Bundle?)：重写onCreate方法，当活动被创建时会调用此方法。savedInstanceState参数用于恢复先前保存的活动状态数据。
super.onCreate(savedInstanceState)：调用父类的onCreate方法，以确保父类的初始化工作得以执行。
setContentView(R.layout.activity_main)：设置活动的布局为activity_main.xml，这将在屏幕上显示相应的UI元素。
val imagePath = "您的图片文件路径" // 图像文件的路径

val imageView = findViewById<ImageView>(R.id.imageView) // 获取ImageView组件实例
imageView.setImageURI(android.net.Uri.parse(imagePath)) // 使用图像路径设置ImageView的图像
val imagePath = "您的图片文件路径"：创建一个字符串变量imagePath，用于存储图像文件的路径。请将实际的图片文件路径替换为"您的图片文件路径"。
val imageView = findViewById<ImageView>(R.id.imageView)：通过findViewById方法获取布局中ID为imageView的ImageView组件实例，并将其存储在imageView变量中。
imageView.setImageURI(android.net.Uri.parse(imagePath))：使用图像路径imagePath设置ImageView的图像。将字符串图像路径解析为Uri对象，并使用setImageURI方法将其设置为ImageView的图像。
