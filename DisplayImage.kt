import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel

fun main() {
    val imagePath = "您的图片文件路径" // 图像文件的路径

    val frame = JFrame() // 创建一个 JFrame 对象
    val imageIcon = ImageIcon(imagePath) // 创建一个 ImageIcon 对象，用于加载图像
    val label = JLabel(imageIcon) // 创建一个 JLabel 对象，并将图像添加到标签上

    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE // 设置窗口关闭时退出程序
    frame.contentPane.add(label) // 将标签添加到窗口的内容面板中
    frame.pack() // 根据图像的大小调整窗口的大小
    frame.isVisible = true // 显示窗口
}
