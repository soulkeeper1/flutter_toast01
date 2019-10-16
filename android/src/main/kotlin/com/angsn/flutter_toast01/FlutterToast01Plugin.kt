package com.angsn.flutter_toast01

import android.content.Context
import android.widget.Toast
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

class FlutterToast01Plugin(val context: Context): MethodCallHandler {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      val channel = MethodChannel(registrar.messenger(), "flutter_toast01")
      channel.setMethodCallHandler(FlutterToast01Plugin(registrar.context()))
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
//    if (call.method == "getPlatformVersion") {
//      result.success("Android ${android.os.Build.VERSION.RELEASE}")
//    } else if(call.method=="toast"){
//        Toast.makeText(context,call.arguments as String,Toast.LENGTH_SHORT).show();
//    }
//            else {
//      result.notImplemented()
//    }
    when(call.method){
      "getPlatformVersion"->result.success("Android ${android.os.Build.VERSION.RELEASE}")
      "toast"->Toast.makeText(context,call.arguments as String,Toast.LENGTH_SHORT).show()
      else->result.notImplemented()
    }
  }
}
