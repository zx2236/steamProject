## steamProject

# Spring Deploy Proceed(forked from gustavoponce7/spring-login)
# 手顺
# 部署步骤

0. Install lombok(IDE plugin) for your IDE(IntelliJ OR Eclipse)

1. $ cd springboot/
2. setting database properties:
   $ vim ./src/main/resources/application.properties
     # ==============================================================
     # = Data Source
     # ==============================================================
     spring.datasource.url = jdbc:mysql://localhost:3306/login?useSSL=true
     spring.datasource.username = root
     spring.datasource.password = 

   set your password to mysql

   create login database:
   $ mysql -uroot -p
   > create database login;
   
3. $ mvn clean
   $ mvn clean install

4. Start server/稼動/执行
   $ java -jar login-0.0.1-SNAPSHOT.jar
   OR
   In IntelliJ(Eclipse)
   :
   Right click LoginApplication in src/main/java/com.gpch/login and 'Run'

TODO: 在SecurityConfiguration中添加不需要登陆的主页路径

   @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.
                authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/registration").permitAll()
                .antMatchers("/admin/**").hasAuthority("ADMIN").anyRequest()
                .authenticated().and().csrf().disable().formLogin()
                ...


