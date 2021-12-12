diff --git a/api/src/main/java/net/md_5/bungee/api/chat/BaseComponent.java b/api/src/main/java/net/md_5/bungee/api/chat/BaseComponent.java
index 936e686..66d7a1e 100644
--- a/api/src/main/java/net/md_5/bungee/api/chat/BaseComponent.java
+++ b/api/src/main/java/net/md_5/bungee/api/chat/BaseComponent.java
@@ -71,7 +71,7 @@
         setColor( old.getColorRaw() );
         setBold( old.isBoldRaw() );
         setItalic( old.isItalicRaw() );
-        setUnderlined( old.isUnderlined() );
+        setUnderlined( old.isUnderlinedRaw() );
         setStrikethrough( old.isStrikethroughRaw() );
         setObfuscated( old.isObfuscatedRaw() );
         setClickEvent( old.getClickEvent() );
