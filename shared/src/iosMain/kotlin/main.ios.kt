import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.ComposeUIViewController

actual fun getPlatformName(): String = "iOS IOS"

fun MainViewController() = ComposeUIViewController {
    Column {
        App()
    }

}

