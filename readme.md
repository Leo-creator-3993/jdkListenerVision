## Jdk 原生方式实现事件监听机制
### 工程说明
#### 基于Jdk原生机制实现自定义的事件监听框架
* 广泛使用的是Spring 提供的事件监听机制,功能强大、灵活
* 此事件监听器机制的特点是借用了InitializingBean在bean注册完成后,回调afterPropertiesSet
* 每个继承AbstractBaseEventListener的子监听器将被自动注入到监听器列表中
