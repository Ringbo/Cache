diff --git a/android/app/src/main/java/com/wingjay/jianshi/db/service/DiaryService.java b/android/app/src/main/java/com/wingjay/jianshi/db/service/DiaryService.java
index b6e2151..a68c64b 100644
--- a/android/app/src/main/java/com/wingjay/jianshi/db/service/DiaryService.java
+++ b/android/app/src/main/java/com/wingjay/jianshi/db/service/DiaryService.java
@@ -27,10 +27,10 @@
   private Context context;
 
   @Inject
-  private Gson gson;
+  Gson gson;
 
   @Inject
-  DiaryService(@ForApplication Context context) {
+  public DiaryService(@ForApplication Context context) {
     this.context = context;
   }
 
