import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.*
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import com.jetbrains.handson.kmm.shared.WebChatSDK
import com.webchat.ui.LaunchScreenModel
import org.jetbrains.compose.resources.ExperimentalResourceApi

class App(private val sdk: WebChatSDK): Screen {

//    @OptIn(ExperimentalResourceApi::class)
//    @Composable
//    fun App(sdk: WebChatSDK) {
//    MaterialTheme {
//        var greetingText by remember { mutableStateOf("Hello, World!") }
//        var showImage by remember { mutableStateOf(false) }
//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Button(onClick = {
//                greetingText = "Hello, ${getPlatformName()}"
//                showImage = !showImage
//            }) {
//                Text(greetingText)
//            }
//            AnimatedVisibility(showImage) {
//                Image(
//                    painterResource("compose-multiplatform.xml"),
//                    null
//                )
//            }
//        }
//    }

    @Composable
    override fun Content() {

        val relaunchModel = rememberScreenModel { LaunchScreenModel(sdk) }

        val state by relaunchModel.state.collectAsState()

        if (state.isEmpty()) {
            Text("kek")
        } else {
            LazyColumn {
                items(state) {
                    Text(it.missionName + it.details + it.launchDateUTC)
                }
            }
        }

        LaunchedEffect(Unit) {
            relaunchModel.getLaunches()
        }
    }

}
expect fun getPlatformName(): String