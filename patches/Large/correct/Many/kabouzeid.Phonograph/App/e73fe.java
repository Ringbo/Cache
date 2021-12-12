diff --git a/app/src/main/java/com/kabouzeid/gramophone/App.java b/app/src/main/java/com/kabouzeid/gramophone/App.java
index d524a3f..761ab9a 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/App.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/App.java
@@ -23,6 +23,6 @@
         Crashlytics crashlyticsKit = new Crashlytics.Builder()
                 .core(new CrashlyticsCore.Builder().disabled(BuildConfig.DEBUG).build())
                 .build();
-        Fabric.with(this, crashlyticsKit, new Crashlytics());
+        Fabric.with(this, crashlyticsKit);
     }
 }
