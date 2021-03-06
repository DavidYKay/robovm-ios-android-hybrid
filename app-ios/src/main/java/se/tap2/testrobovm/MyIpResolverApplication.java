package se.tap2.testrobovm;

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.uikit.*;


public class MyIpResolverApplication extends UIApplicationDelegateAdapter {

    private UIWindow window = null;
    private int clickCount = 0;
    private UIViewController viewController;

    @Override
    public boolean didFinishLaunching(UIApplication application,
                                      UIApplicationLaunchOptions launchOptions) {
  
        window = new UIWindow(UIScreen.getMainScreen().getBounds());


        // Try this to see that you can use X code interface builder to draw your UI
        //viewController = new NibViewController();

        viewController = new MyIpViewController();

        window.setRootViewController(viewController);
        window.makeKeyAndVisible();
        
        return true;
    }

    public static void main(String[] args) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(args, null, MyIpResolverApplication.class);
        pool.drain();
    }
}