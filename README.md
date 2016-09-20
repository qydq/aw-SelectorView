# aw-SelectorView

这个项目的主要功能是demo，实现点击动画切换。

本项目地址：https://github.com/qydq/aw-SelectorView

个人知乎主页：https://www.zhihu.com/people/qydq

个人博客主页：

如有使用问题请发送电子邮件。

邮件地址： staryumou@163.com  /  qyddai@gmail.com

# 特别说明

*** -----------------------------woshifengexian-----------------------------------***
	
	创建时间 <------------->
	
	2016年09月17日2016年09月19日;最近修改时间：2016年09月20日。
	
### Tips
	
1。前言（包含该项目主要实现的功能的简短说明，运行配置；可选）。

2。实现效果（如果没有可以省略，但是建议要包含，因为项目以后自己看到的时候会帮助自己理解）。

3。思路或使用（代码）。

 ## ***   实现思路    *** ##  

 ## ***   使用方法    *** ##  

4。重要知识点（总结，思考）。

5。内容参考（尊重原创）。

6。联系作者。
	
*** -----------------------------woshifengexian-----------------------------------***

# 前言

提供了选择器切换功能

# 实现效果

| ![](https://github.com/qydq/aw-SelectorView/blob/master/screenpic/README.md.jpg)| 

# 思路和使用。

##  ***    思路     ***  ##

提示。建议在AndroidManifest.xml 的application中加入android:theme="@style/Theme.AppCompat.Light.NoActionBar"

### 在引用时，继承SuperActivity实现，里面的方法即可。

### 在引用时，继承SuperFragment实现，里面的方法即可。

### 一些工具类。(具体参考知乎博客--暂时还没有详细)

 DUtilsFeature,传入相应的参数即可加入MD的特性。
 
 DUtilsActivity吧每一个activity放入堆栈中，方便应用程序某时候需要退出的功能。
 
 DUtislAnimHeart an框架提供的一个动画，心跳的工具类。
 
 DUtilsMD5 an框架提供了一个简单的DM5加密功能。
 
 example：
 
		final DUtilsMD5 md5 = DUtilsMD5.getInstance();
        final String token = md5.md5(username + md5.md5(password) + time + "app");
		
	这里面还包含了简单的表单验证功能，保存文件，将转换为字节数组，判断是否是合法的数字
	
	下面给出除MD5其它方法
	
		Date getNowDay()
		byte charToByte(char c)
		byte[] hexStringToBytes(String hexString)
		void saveBitmap(Bitmap bm, String dir, String picName)
		byte[] getImage(String path)//可以是网络图片
		byte[] readInputStream(InputStream inputStream)
		String getCurrentTimeString()
		boolean isMobileNO(String mobiles)
		String byteArrayToHex(byte[] byteArray)//这个函数用于将字节数组换成成16进制的字符串
				
 DUtilsDatetime an框架提供的时间类
 
 example:
 
		DUtilsDatetime dUtilsDatetime = DUtilsDatetime.getInstance();
		final String timestamp = dUtilsDatetime.getShotDateTime();
		
### 可以使用showToast替代系统的Toast.make，后期会加入SnackBar等MD。

### 一些view使用。字面意思可以都出来，不详说。

LuueCircleImageView

LuueSmoothImageView

LuueVerticalViewPager

LuueViewPager

### 一些Activity。

AnBasePicDetailsActivity，控制图片的方法缩小的activity只需要传入图片地址即可。

### 一些Drawable。半透明

		yy_drawable_selector_ll_shape.xml  //ll的selector
		
		yy_drawable_selector_shape.xml  //通用的selector
		
		yy_drawable_bgday_shape.xml  //渐变drawable
		yy_drawable_bgnigt_shape.xml  
		
		base_drawable_backarrow_gray.png  //返回图标
		base_drawable_backarrow_white.png
		
		base_drawable_warning.png //警告图标
		
		yy_drawable_selector_md_shape_clicked.xml

### 其它TIPS

##### an框架为大家提供了夜间模式的功能，鉴于google还没有正式推出这个功能，如果需要可以中这里集成。‘

####### 具体夜间模式使用请链接到如下

https://zhuanlan.zhihu.com/p/22520818?refer=qyddai


使用参考：

       //用来保存皮肤切换模式的sp
        sp = this.getSharedPreferences(TAG, Context.MODE_WORLD_READABLE);
        if (sp.getBoolean("isNightMode", false)) {
            getWindow().getDecorView().setBackground(this.getResources().getDrawable(R.drawable.yy_drawable_bgnigt_shape));
        } else {
            getWindow().getDecorView().setBackground(getResources().getDrawable(R.drawable.yy_drawable_bgday_shape));
        }


##### an框架之于Xutils3.0的特性再封装。

##### 网络变化相关监听，可以判断网络的变化，系统做出相应的提示，具体业务请自行实现

集成SuperActivity实现onNetChange方法即可，不要网络监听也可以空实现。

使用参考：

		@Override
		public void onNetChange(int netModile) {
        // TODO Auto-generated method stub
        //在这个判断，根据需要做处理,判断网络的变化
        if (netModile == 1) {
            wangluo.setText("inspectNet：连接wifi");
            System.out.println("inspectNet：连接wifi");
        } else if (netModile == 0) {
            wangluo.setText("inspectNet:连接移动数据");
            System.out.println("inspectNet:连接移动数据");
        } else if (netModile == -1) {
            wangluo.setText("inspectNet:当前没有网络");
            System.out.println("inspectNet:当前没有网络");
        }
    }

# 内容参考。

个人原创


# 联系作者。

Athor IP：sunshuntao（qydq）（莳萝花）。

Email：qyddai@gmail.com。

知乎项目地址：https://zhuanlan.zhihu.com/qyddai


Github上面都是开源项目，欢迎大家下载我的项目或者有问题的同学可以发送邮件给我，如果收到邮件我会第一次时间回复处理。

后记：

## an-base > module /build.gradle

		apply plugin: 'com.android.library'
		////配置jitpack
		apply plugin: 'com.github.dcendents.android-maven'
		group = 'com.github.qydq'
		dependencies {
		compile fileTree(dir: 'libs', include: ['*.jar'])
		androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
        exclude group: 'com.android.support', module: 'support-annotations'
		})
		compile 'com.android.support:appcompat-v7:24.2.0'
		testCompile 'junit:junit:4.12'
		compile 'org.xutils:xutils:3.3.36'
		compile 'com.android.support:design:24.2.0'···
	
## an-maven-base > project /build.gradle

		buildscript {
		repositories {
			jcenter()
		}
		dependencies {
			classpath 'com.android.tools.build:gradle:2.2.0-rc2'
			// jitpack发布github
			classpath 'com.github.dcendents:android-maven-gradle-plugin:1.5'
			// NOTE: Do not place your application dependencies here; they belong
			// in the individual module build.gradle files
		}
		}·
		
## 权限相关。an-mave-base /AndroidManifest.xml	

		<!-- 网络相关权限 -->
		<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
		<uses-permission android:name="android.permission.INTERNET" />
		<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
		<uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
		<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
		<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
		
## AndroidManifest.xml

引用的地方应该使用这种theme
		<application
        android:allowBackup="true"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/Theme.AppCompat.Light.NoActionBar"
        android:windowSoftInputMode="stateAlwaysHidden">
		</application>
		
		
## 编译及相关SDK配置。

		android {
			compileSdkVersion 24
			buildToolsVersion "24.0.2"

			defaultConfig {
			minSdkVersion 19
			targetSdkVersion 24
			versionCode 1
			versionName "1.0"

			testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"

		}
		
		
		