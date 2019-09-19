# muhammad_abuzar
# muhammad-abuzar
# SetUp Environment 
 
 **Install Homebrew**
 

 **Install JAVA**
 
 
 **Install Node**
 
 
 **Install Android Studio**
 
 
 **Install Android SDK**
 
 
 **Add Environment Variables**
 
 - Determine which shell you use. Open a terminal and run $ echo $SHELL. 
 - Based on your shell, you need to edit your profile. e.g. $ vim ~/.bash_profile or ~/.profile or ~/.zshrc. 
 - Add the following variables: 
 - export ANDROID_HOME=//Users/YourUser/Library/Android/sdk 
 - export JAVA_HOME=$(/usr/libexec/java_home) 
 
 - Add the Android sdk paths to your existing PATH=$PATH variable. e.g. :/Users/your-user-name/android-sdk-macosx/sdk/tools:/Users/your-user-name/android-sdk-macosx/sdk/platform-tools:/Users/your-user-name/android-sdk-macosx/sdk/build-tools: 
 - ave profile. 
 - Force close/quit all your terminal windows and open a new one. 
 
 **Test Environment Variables**
 
 
 **Test if ADB is installed**
 
 **Install Appium Desktop**
 
 - Download and install Appium Desktop 
 - Install Appium via NPM
 - Run $ npm install -g appium 
 - Verify appium installed correctly by doing $ appium -v 
 
 **Install Appium Doctor via NPM**
 
 - Run $ npm install -g appium-doctor 
 - Run $ appium-doctor (checks setup is correct on machine) 
 - Verify "info AppiumDoctor Everything looks good, bye!" is displayed. 
 
 **Install Intellij**
 
 **Install testng plugin**
 
 **Import the project**
 
 **If you want to run the project in real device just update the device in the test classes i.e. caps.setCapability(MobileCapabilityType.DEVICE_NAME, ""); **
 
