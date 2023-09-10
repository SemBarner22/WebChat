import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

actual fun getPlatformName(): String = "Android"

@Composable fun MainView() = App()


@Preview(showBackground = true)
@Composable
fun MyApp() {

}