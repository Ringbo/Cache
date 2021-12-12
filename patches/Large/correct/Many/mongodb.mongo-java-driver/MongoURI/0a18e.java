diff --git a/src/main/com/mongodb/MongoURI.java b/src/main/com/mongodb/MongoURI.java
index 067c535..bd11b7f 100644
--- a/src/main/com/mongodb/MongoURI.java
+++ b/src/main/com/mongodb/MongoURI.java
@@ -154,7 +154,7 @@
                 else if ( key.equals( "w" ) ) _options.w = Integer.parseInt( value );
                 else if ( key.equals( "wtimeout" ) ) _options.wtimeout = Integer.parseInt( value );
                 else if ( key.equals( "fsync" ) ) _options.fsync = _parseBoolean( value );
-                else LOGGER.warning( "Unknown or Unsupported Option '" + value + "'" );
+                else LOGGER.warning( "Unknown or Unsupported Option '" + key + "'" );
             }
         }
     }
