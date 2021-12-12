diff --git a/chat/src/main/java/net/md_5/bungee/chat/BaseComponentSerializer.java b/chat/src/main/java/net/md_5/bungee/chat/BaseComponentSerializer.java
index bf17391..cb1d24a 100644
--- a/chat/src/main/java/net/md_5/bungee/chat/BaseComponentSerializer.java
+++ b/chat/src/main/java/net/md_5/bungee/chat/BaseComponentSerializer.java
@@ -35,11 +35,11 @@
         }
         if ( object.has( "strikethrough" ) )
         {
-            component.setUnderlined( object.get( "strikethrough" ).getAsBoolean() );
+            component.setStrikethrough( object.get( "strikethrough" ).getAsBoolean() );
         }
         if ( object.has( "obfuscated" ) )
         {
-            component.setUnderlined( object.get( "obfuscated" ).getAsBoolean() );
+            component.setObfuscated( object.get( "obfuscated" ).getAsBoolean() );
         }
         if ( object.has( "extra" ) )
         {
