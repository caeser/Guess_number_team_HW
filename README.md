小組作業-猜數字
===============


下載git
--------

 - Linux: 用套件管理員安裝git
 - Windows: 到「http://code.google.com/p/msysgit/downloads/list?q=full+installer+official+git」下載最新版本的msysgit，安裝

下載專案
----

請打開Terminal(終端機)，執行

``` shell
mkdir Guess_number_team_HW
git clone git@github.com:xsoameix/Guess_number_team_HW.git
```

上傳專案
--------

把自己更改過的檔案加入更新清單

``` shell
git add file1.java
git add file2.java
git add ...
```

加入註解

``` shell
git commit -m "跟別人說你改了甚麼"
```

上傳

``` shell
git push
```

補充
----

 - 重新修改註解
``` shell
git commit --amend -m "註解"
```

 - 對單一檔案重新修改註解
``` shell
git commit --amend file.java -m "註解"
```
