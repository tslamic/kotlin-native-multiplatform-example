import platform.UIKit.UIDevice

actual fun platformName(): String = UIDevice.currentDevice.name
