# aw-SelectorView

�����Ŀ����Ҫ������demo��ʵ�ֵ�������л���

����Ŀ��ַ��https://github.com/qydq/aw-SelectorView

����֪����ҳ��https://www.zhihu.com/people/qydq

���˲�����ҳ��

����ʹ�������뷢�͵����ʼ���

�ʼ���ַ�� staryumou@163.com  /  qyddai@gmail.com

# �ر�˵��

*** -----------------------------woshifengexian-----------------------------------***
	
	����ʱ�� <------------->
	
	2016��09��17��2016��09��19��;����޸�ʱ�䣺2016��09��20�ա�
	
### Tips
	
1��ǰ�ԣ���������Ŀ��Ҫʵ�ֵĹ��ܵļ��˵�����������ã���ѡ����

2��ʵ��Ч�������û�п���ʡ�ԣ����ǽ���Ҫ��������Ϊ��Ŀ�Ժ��Լ�������ʱ�������Լ���⣩��

3��˼·��ʹ�ã����룩��

 ## ***   ʵ��˼·    *** ##  

 ## ***   ʹ�÷���    *** ##  

4����Ҫ֪ʶ�㣨�ܽᣬ˼������

5�����ݲο�������ԭ������

6����ϵ���ߡ�
	
*** -----------------------------woshifengexian-----------------------------------***

# ǰ��

�ṩ��ѡ�����л�����

# ʵ��Ч��

| ![](https://github.com/qydq/aw-SelectorView/blob/master/screenpic/README.md.jpg)| 

# ˼·��ʹ�á�

##  ***    ˼·     ***  ##

��ʾ��������AndroidManifest.xml ��application�м���android:theme="@style/Theme.AppCompat.Light.NoActionBar"

### ������ʱ���̳�SuperActivityʵ�֣�����ķ������ɡ�

### ������ʱ���̳�SuperFragmentʵ�֣�����ķ������ɡ�

### һЩ�����ࡣ(����ο�֪������--��ʱ��û����ϸ)

 DUtilsFeature,������Ӧ�Ĳ������ɼ���MD�����ԡ�
 
 DUtilsActivity��ÿһ��activity�����ջ�У�����Ӧ�ó���ĳʱ����Ҫ�˳��Ĺ��ܡ�
 
 DUtislAnimHeart an����ṩ��һ�������������Ĺ����ࡣ
 
 DUtilsMD5 an����ṩ��һ���򵥵�DM5���ܹ��ܡ�
 
 example��
 
		final DUtilsMD5 md5 = DUtilsMD5.getInstance();
        final String token = md5.md5(username + md5.md5(password) + time + "app");
		
	�����滹�����˼򵥵ı���֤���ܣ������ļ�����ת��Ϊ�ֽ����飬�ж��Ƿ��ǺϷ�������
	
	���������MD5��������
	
		Date getNowDay()
		byte charToByte(char c)
		byte[] hexStringToBytes(String hexString)
		void saveBitmap(Bitmap bm, String dir, String picName)
		byte[] getImage(String path)//����������ͼƬ
		byte[] readInputStream(InputStream inputStream)
		String getCurrentTimeString()
		boolean isMobileNO(String mobiles)
		String byteArrayToHex(byte[] byteArray)//����������ڽ��ֽ����黻�ɳ�16���Ƶ��ַ���
				
 DUtilsDatetime an����ṩ��ʱ����
 
 example:
 
		DUtilsDatetime dUtilsDatetime = DUtilsDatetime.getInstance();
		final String timestamp = dUtilsDatetime.getShotDateTime();
		
### ����ʹ��showToast���ϵͳ��Toast.make�����ڻ����SnackBar��MD��

### һЩviewʹ�á�������˼���Զ�����������˵��

LuueCircleImageView

LuueSmoothImageView

LuueVerticalViewPager

LuueViewPager

### һЩActivity��

AnBasePicDetailsActivity������ͼƬ�ķ�����С��activityֻ��Ҫ����ͼƬ��ַ���ɡ�

### һЩDrawable����͸��

		yy_drawable_selector_ll_shape.xml  //ll��selector
		
		yy_drawable_selector_shape.xml  //ͨ�õ�selector
		
		yy_drawable_bgday_shape.xml  //����drawable
		yy_drawable_bgnigt_shape.xml  
		
		base_drawable_backarrow_gray.png  //����ͼ��
		base_drawable_backarrow_white.png
		
		base_drawable_warning.png //����ͼ��
		
		yy_drawable_selector_md_shape_clicked.xml

### ����TIPS

##### an���Ϊ����ṩ��ҹ��ģʽ�Ĺ��ܣ�����google��û����ʽ�Ƴ�������ܣ������Ҫ���������Ｏ�ɡ���

####### ����ҹ��ģʽʹ�������ӵ�����

https://zhuanlan.zhihu.com/p/22520818?refer=qyddai


ʹ�òο���

       //��������Ƥ���л�ģʽ��sp
        sp = this.getSharedPreferences(TAG, Context.MODE_WORLD_READABLE);
        if (sp.getBoolean("isNightMode", false)) {
            getWindow().getDecorView().setBackground(this.getResources().getDrawable(R.drawable.yy_drawable_bgnigt_shape));
        } else {
            getWindow().getDecorView().setBackground(getResources().getDrawable(R.drawable.yy_drawable_bgday_shape));
        }


##### an���֮��Xutils3.0�������ٷ�װ��

##### ����仯��ؼ����������ж�����ı仯��ϵͳ������Ӧ����ʾ������ҵ��������ʵ��

����SuperActivityʵ��onNetChange�������ɣ���Ҫ�������Ҳ���Կ�ʵ�֡�

ʹ�òο���

		@Override
		public void onNetChange(int netModile) {
        // TODO Auto-generated method stub
        //������жϣ�������Ҫ������,�ж�����ı仯
        if (netModile == 1) {
            wangluo.setText("inspectNet������wifi");
            System.out.println("inspectNet������wifi");
        } else if (netModile == 0) {
            wangluo.setText("inspectNet:�����ƶ�����");
            System.out.println("inspectNet:�����ƶ�����");
        } else if (netModile == -1) {
            wangluo.setText("inspectNet:��ǰû������");
            System.out.println("inspectNet:��ǰû������");
        }
    }

# ���ݲο���

����ԭ��


# ��ϵ���ߡ�

Athor IP��sunshuntao��qydq����ݪ�ܻ�����

Email��qyddai@gmail.com��

֪����Ŀ��ַ��https://zhuanlan.zhihu.com/qyddai


Github���涼�ǿ�Դ��Ŀ����ӭ��������ҵ���Ŀ�����������ͬѧ���Է����ʼ����ң�����յ��ʼ��һ��һ��ʱ��ظ�����

��ǣ�

## an-base > module /build.gradle

		apply plugin: 'com.android.library'
		////����jitpack
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
		compile 'com.android.support:design:24.2.0'������
	
## an-maven-base > project /build.gradle

		buildscript {
		repositories {
			jcenter()
		}
		dependencies {
			classpath 'com.android.tools.build:gradle:2.2.0-rc2'
			// jitpack����github
			classpath 'com.github.dcendents:android-maven-gradle-plugin:1.5'
			// NOTE: Do not place your application dependencies here; they belong
			// in the individual module build.gradle files
		}
		}��
		
## Ȩ����ء�an-mave-base /AndroidManifest.xml	

		<!-- �������Ȩ�� -->
		<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
		<uses-permission android:name="android.permission.INTERNET" />
		<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
		<uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
		<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
		<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
		
## AndroidManifest.xml

���õĵط�Ӧ��ʹ������theme
		<application
        android:allowBackup="true"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/Theme.AppCompat.Light.NoActionBar"
        android:windowSoftInputMode="stateAlwaysHidden">
		</application>
		
		
## ���뼰���SDK���á�

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
		
		
		