import androidx.compose.ui.window.ComposeUIViewController
import com.cmp.listify..App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
