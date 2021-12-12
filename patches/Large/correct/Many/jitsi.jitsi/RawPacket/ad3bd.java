diff --git a/src/net/java/sip/communicator/impl/neomedia/RawPacket.java b/src/net/java/sip/communicator/impl/neomedia/RawPacket.java
index 3ddc276..7fe70f5 100644
--- a/src/net/java/sip/communicator/impl/neomedia/RawPacket.java
+++ b/src/net/java/sip/communicator/impl/neomedia/RawPacket.java
@@ -626,7 +626,7 @@
                         + FIXED_HEADER_SIZE
                         + getCsrcCount()*4 + 2;
 
-        return ((buffer[extLenIndex] << 4) | buffer[extLenIndex + 1]) * 4;
+        return ((buffer[extLenIndex] << 8) | buffer[extLenIndex + 1]) * 4;
     }
 
     /**
@@ -690,7 +690,7 @@
         }
         // length field counts the number of 32-bit words in the extension
         int lengthInWords = (totalExtensionLen + 3)/4;
-        newBuffer[newBufferOffset++] = (byte)(lengthInWords >>4);
+        newBuffer[newBufferOffset++] = (byte)(lengthInWords >> 8);
         newBuffer[newBufferOffset++] = (byte)lengthInWords;
 
         // Copy the existing extension content if any.
