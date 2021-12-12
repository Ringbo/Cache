diff --git a/proxy/src/main/java/net/md_5/bungee/BungeeCord.java b/proxy/src/main/java/net/md_5/bungee/BungeeCord.java
index 8fc2f88..795a015 100644
--- a/proxy/src/main/java/net/md_5/bungee/BungeeCord.java
+++ b/proxy/src/main/java/net/md_5/bungee/BungeeCord.java
@@ -660,13 +660,13 @@
             return Collections.singleton( exactMatch );
         }
 
-        return Sets.newHashSet( Iterables.find( getPlayers(), new Predicate<ProxiedPlayer>()
+        return Sets.newHashSet( Iterables.filter( getPlayers(), new Predicate<ProxiedPlayer>()
         {
 
             @Override
             public boolean apply(ProxiedPlayer input)
             {
-                return ( input == null ) ? false : input.getName().toLowerCase().contains( partialName.toLowerCase() );
+                return ( input == null ) ? false : input.getName().toLowerCase().startsWith( partialName.toLowerCase() );
             }
         } ) );
     }
