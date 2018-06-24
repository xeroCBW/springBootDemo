


# security 设置登入
可以配置10+多个filter,然后进行拦截;目前只是用到了2个

![](https://upload-images.jianshu.io/upload_images/874748-6f0cf11f32d5f284.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![](https://upload-images.jianshu.io/upload_images/874748-8a2dddc01b1f1b09.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



### 主要有两个登录filter
- userpasswordFilter(使用用户名,密码)
- basicAuthFilter (使用token)

### filterSecurity过滤器

过滤访问最后一个环节,在browser进行配置,最后来判断Restapi是否能够进行访问


#### 使用自己自定义的拦截器

自定义userDetils(实现userDetails接口),名字叫userDetailServiceImpl,并且变成一个bean

#### 跳转到自定义的界面上

![](https://upload-images.jianshu.io/upload_images/874748-f3efb058e65d36fa.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


注意:

跳转到自定义界面上,一定要将请求后面加上html;否者会一律认为是普通的json请求
