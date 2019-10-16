#import "FlutterToast01Plugin.h"
#import <flutter_toast01/flutter_toast01-Swift.h>

@implementation FlutterToast01Plugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterToast01Plugin registerWithRegistrar:registrar];
}
@end
