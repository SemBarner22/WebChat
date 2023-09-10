import androidx.compose.ui.window.ComposeUIViewController
import cafe.adriel.voyager.navigator.Navigator
import com.jetbrains.handson.kmm.shared.WebChatSDK

actual fun getPlatformName(): String = "iOS"

fun MainViewController(sdk: WebChatSDK) = ComposeUIViewController { Navigator(App(sdk)) }