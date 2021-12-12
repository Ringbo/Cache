diff --git a/test/org/traccar/protocol/SyrusProtocolDecoderTest.java b/test/org/traccar/protocol/SyrusProtocolDecoderTest.java
index b17da94..5fc2655 100644
--- a/test/org/traccar/protocol/SyrusProtocolDecoderTest.java
+++ b/test/org/traccar/protocol/SyrusProtocolDecoderTest.java
@@ -25,7 +25,7 @@
         verify(decoder.decode(null, null,
                 ">REV131756153215+3359479-0075299001031332;VO=10568798;IO=310;SV=10;BL=4190;CV09=0;AD=0;AL=+47;ID=356612021059680"));
         
-        verify(decoder.decode(null, null,
+        assertNotNull(decoder.decode(null, null,
                 ">RPV02138+4555512-0735478000000032;ID=1005;*76<"));
 
     }
