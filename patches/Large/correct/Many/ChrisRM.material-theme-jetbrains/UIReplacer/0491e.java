diff --git a/src/main/java/com/chrisrm/idea/utils/UIReplacer.java b/src/main/java/com/chrisrm/idea/utils/UIReplacer.java
index f7f020b..c977d91 100644
--- a/src/main/java/com/chrisrm/idea/utils/UIReplacer.java
+++ b/src/main/java/com/chrisrm/idea/utils/UIReplacer.java
@@ -267,15 +267,15 @@
       declaredConstructor.setAccessible(true);
       final Color errorBackground = ObjectUtils.notNull(UIManager.getColor("Notifications.errorBackground"), new JBColor(
           new ColorUIResource(0xE53935),
-          new ColorUIResource(0xFF5370)
+          new ColorUIResource(0x743A3A)
       ));
       final Color warnBackground = ObjectUtils.notNull(UIManager.getColor("Notifications.warnBackground"), new JBColor(
           new ColorUIResource(0xFFB62C),
-          new ColorUIResource(0xFFCB6B))
+          new ColorUIResource(0x7F6C00))
       );
       final Color infoBackground = ObjectUtils.notNull(UIManager.getColor("Notifications.infoBackground"), new JBColor(
           new ColorUIResource(0x91B859),
-          new ColorUIResource(0xC3E88D))
+          new ColorUIResource(0x356936))
       );
 
       final JBColor errorBackgroundColor = new JBColor(errorBackground, errorBackground);
