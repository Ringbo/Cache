diff --git a/protocol/src/main/java/net/md_5/bungee/protocol/packet/TabCompleteResponse.java b/protocol/src/main/java/net/md_5/bungee/protocol/packet/TabCompleteResponse.java
index 64851dd..7206bed 100644
--- a/protocol/src/main/java/net/md_5/bungee/protocol/packet/TabCompleteResponse.java
+++ b/protocol/src/main/java/net/md_5/bungee/protocol/packet/TabCompleteResponse.java
@@ -79,7 +79,7 @@
             {
                 writeString( suggestion.getText(), buf );
                 buf.writeBoolean( suggestion.getTooltip() != null );
-                if ( suggestion.getTooltip() != null )
+                if ( suggestion.getTooltip() != null && suggestion.getTooltip().getString() != null )
                 {
                     writeString( suggestion.getTooltip().getString(), buf );
                 }
