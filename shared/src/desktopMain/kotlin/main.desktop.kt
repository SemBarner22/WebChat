import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.jetbrains.handson.kmm.shared.WebChatSDK

actual fun getPlatformName(): String = "Desktop"

@Composable fun MainView(sdk: WebChatSDK) = Navigator(App(sdk))

@Preview
@Composable
fun AppPreview() {

}