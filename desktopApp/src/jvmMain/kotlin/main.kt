import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.jetbrains.handson.kmm.shared.WebChatSDK
import com.jetbrains.handson.kmm.shared.cache.DatabaseDriverFactory

fun main() = application {

    val sdk = WebChatSDK(DatabaseDriverFactory())

    Window(onCloseRequest = ::exitApplication) {
        MainView(sdk)
    }
}