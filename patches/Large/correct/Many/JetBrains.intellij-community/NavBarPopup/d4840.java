diff --git a/platform/lang-impl/src/com/intellij/ide/navigationToolbar/NavBarPopup.java b/platform/lang-impl/src/com/intellij/ide/navigationToolbar/NavBarPopup.java
index 2997971..e7ac023 100644
--- a/platform/lang-impl/src/com/intellij/ide/navigationToolbar/NavBarPopup.java
+++ b/platform/lang-impl/src/com/intellij/ide/navigationToolbar/NavBarPopup.java
@@ -158,7 +158,7 @@
       @Nullable
       @Override
       public Object getData(String dataId) {
-        return panel.getDataImpl(dataId, this, () -> JBIterable.of(getSelectedValuesList()));
+        return panel.getDataImpl(dataId, this, () -> JBIterable.from(getSelectedValuesList()));
       }
     }
     JBList<Object> list = new MyList<>();
