package ir.sina.designsystem

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(name = "Light", showBackground = true)
@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
annotation class ThemePreview


@Preview(name = "Phone", device = "spec:shape=Normal,width=360,height=640,unit=dp,dpi=480")
@Preview(name = "Tablet", device = "spec:shape=Normal,width=1280,height=800,unit=dp,dpi=480")
@Preview(name = "Foldable", device = "spec:shape=Normal,width=673,height=841,unit=dp,dpi=480")
@Preview(name = "desktop", device = "spec:shape=Normal,width=1920,height=1080,unit=dp,dpi=480")
annotation class DevicesPreviews