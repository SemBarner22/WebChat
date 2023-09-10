import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import com.jetbrains.handson.kmm.shared.WebChatSDK

actual fun getPlatformName(): String = "Android"

@Composable fun MainView(sdk: WebChatSDK) = Navigator(App(sdk))


@Preview(showBackground = true)
@Composable
fun MyApp() {

}