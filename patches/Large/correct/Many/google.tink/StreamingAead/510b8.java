diff --git a/java/src/main/java/com/google/crypto/tink/StreamingAead.java b/java/src/main/java/com/google/crypto/tink/StreamingAead.java
index 83933e9..6bea0f0 100644
--- a/java/src/main/java/com/google/crypto/tink/StreamingAead.java
+++ b/java/src/main/java/com/google/crypto/tink/StreamingAead.java
@@ -25,24 +25,23 @@
 import java.security.GeneralSecurityException;
 
 /**
- * An interface for streaming authenticated encryption with additional data.
+ * An interface for streaming authenticated encryption with associated data.
  *
  * <p>Streaming encryption is typically used for encrypting large plaintexts such as large files.
  * Tink may eventually contain multiple interfaces for streaming encryption depending on the
  * supported properties. This interface supports a streaming interface for symmetric encryption with
  * authentication. The underlying encryption modes are selected so that partial plaintext can be
- * obtained fast by decrypting and authenticating just part of the ciphertext.
+ * obtained fast by decrypting and authenticating just a part of the ciphertext.
  *
- * <pre>
  * Security:
  * =========
- * Instances of StreamingAead must follow the OAE2 definition as proposed in the paper
+ * <p>Instances of StreamingAead must follow the OAE2 definition as proposed in the paper
  * "Online Authenticated-Encryption and its Nonce-Reuse Misuse-Resistance" by Hoang, Reyhanitabar,
  * Rogaway and Vizár https://eprint.iacr.org/2015/189.pdf
  *
  * Restrictions:
  * =============
- * Encryption must be done in one session. There is no possibility to modify an existing
+ * <p>Encryption must be done in one session. There is no possibility to modify an existing
  * ciphertext or append to it (other than reencrypt the whole file again). One reason
  * for this restriction is the use of AES-GCM as one cipher to implement this interface.
  * If single segments are modified then this is equivalent to reusing the same IV twice, but
@@ -52,19 +51,22 @@
  *
  * Blocking vs non-blocking I/O
  * ============================
- * Channels can be in blocking (i.e. always waits untile the requrested number of bytes have been
- * processed) or non-blocking mode.
- * If the channel provided to the streaming encryption is in blocking mode then encryption and
- * decryption have the same property. That is encryption always processes all the plaintext passed
- * in and waits until complete segments have been written to the ciphertext channel. Similarly,
- * decryption blocks until sufficiently many bytes have been read from the ciphertext channel until
- * all the requested plaintext has been decrypted and authenticated, an IOException occurred, or the
- * end of the plaintext has been reached.
+ * <p>A channel can be in a blocking mode (i.e. always waits until the requested number of bytes
+ * have been processed) or non-blocking mode (i.e. I/O operation will never block and may
+ * transfer fewer bytes than were requested or possibly no bytes at all).
  *
- * If the channel provided to the streaming encryption is in non-blocking mode, then encryption and
- * decryption are also non-blocking. Since encryption and decryption is done in segments it is
- * possible that for example a call attempting to read() returns no plaintext at all even if
- * partial ciphertext was read from the underlying channel.
+ * <p>If the channel provided to the streaming encryption is in blocking mode then encryption and
+ * decryption have the same property. That is, encryption always processes all the plaintext
+ * passed in, and waits until complete segments have been written to the ciphertext channel
+ * (incomplete segment, if any, is buffered).
+ * Similarly, decryption blocks until sufficiently many bytes have been read from the ciphertext
+ * channel so that all the requested plaintext can be decrypted and authenticated, or until
+ * the end of the plaintext has been reached, or an IOException occurred.
+ *
+ * <p>If the channel provided to the streaming encryption is in non-blocking mode, then encryption
+ * and decryption are also non-blocking. Since encryption and decryption is done in segments
+ * it is possible that for example a call attempting to read() returns no plaintext at all
+ * even if partial ciphertext was read from the underlying channel.
  *
  * Sample encryption:
  * ==================
@@ -108,11 +110,13 @@
 public interface StreamingAead {
 
   /**
-   * Returns a WritableByteChannel for plaintext.
+   * Returns a WritableByteChannel for plaintext.  Any data written to the returned
+   * channel will be encrypted and the resulting ciphertext written to the provided
+   * {@code ciphertextDestination}
    *
    * @param ciphertextDestination the channel to which the ciphertext is written.
-   * @param associatedData data associated with the plaintext. This data is authenticated but not
-   *     encrypted. It must be passed into the decryption.
+   * @param associatedData data associated with the plaintext. This data is authenticated
+   *     but not encrypted. It must be passed into the decryption.
    */
   WritableByteChannel newEncryptingChannel(
       WritableByteChannel ciphertextDestination, byte[] associatedData)
@@ -123,34 +127,36 @@
    *
    * @param ciphertextSource the ciphertext
    * @param associatedData the data associated with the ciphertext.
-   * @return a SeekableByteChannel that allows random read access to the plaintext. The following
+   * @return {@link SeekableByteChannel} that allows random read access to the plaintext. The following
    *     methods of SeekableByteChannel are implemented:
    *     <ul>
-   *       <li><code>long position()</code> Returns the channel's position in the plaintext.
-   *       <li><code>SeekableByteChannel  position(long newPosition)</code> Sets the channel's
-   *           position. Setting the position to a value greater than the plaintext size is legal. A
-   *           later attempt to read byte will immediately return an end-of-file indication.
-   *       <li><code>int read(ByteBuffer dst)</code> Bytes are read starting at the channel's
+   *       <li>{@code long position()} Returns the channel's position in the plaintext.
+   *       <li>{@code SeekableByteChannel  position(long newPosition)} Sets the channel's
+   *           position. Setting the position to a value greater than the plaintext size is legal.
+   *           A later attempt to read byte will immediately return an end-of-file indication.
+   *       <li>{@code int read(ByteBuffer dst)} Bytes are read starting at the channel's
    *           position, and then the position is updated with the number of bytes actually read.
    *           All bytes returned have been authenticated. If the end of the stream has been reached
    *           -1 is returned. A result of -1 is authenticated (e.g. by checking the MAC of the last
-   *           ciphertext chunk.) Throws java.io.IOException if a MAC verification failed. read
-   *           attempt to fill dst, but may return less bytes than requested if reads to
-   *           ciphertextSource do not return the requested number of bytes or if the plaintext
-   *           ended. TODO(bleichen): Should we extend the interface with read(ByteBuffer dst, long
-   *           position) to avoid race conditions?
-   *       <li><code>long size()</code> Returns the size of the plaintext. (TODO: Decide whether the
-   *           result should be authenticated)
-   *       <li><code>SeekableByteChannel truncate(long size)</code> throws
-   *           NonWritableChannelException because the channel is read-only.
-   *       <li><code>int write(ByteBuffer src)</code> throws NonWritableChannelException because the
-   *           channel is read-only.
-   *       <li><code>close()</code> closes the channel
-   *       <li><code>isOpen()</code>
+   *           ciphertext chunk.)   A call to this function attempts to fill dst, but it may return
+   *           fewer bytes than requested, e.g. if the underlying ciphertextSource does not provide
+   *           the requested number of bytes or if the plaintext ended.
+   *
+   *           Throws {@link IOException} if a MAC verification failed.
+   *           TODO: Should we extend the interface with read(ByteBuffer dst, long position)
+   *                 to avoid race conditions?
+   *       <li>{@code long size()} Returns the size of the plaintext.
+   *           TODO: Decide whether the result should be authenticated)
+   *       <li>{@code SeekableByteChannel truncate(long size)} throws
+   *           {@link NonWritableChannelException} because the channel is read-only.
+   *       <li>{@code int write(ByteBuffer src)} throws {@link NonWritableChannelException} because
+   *           the channel is read-only.
+   *       <li>{@code close()} closes the channel
+   *       <li>{@code isOpen()}
    *     </ul>
    *
-   * @throws GeneralSecurityException if the header of the ciphertext is corrupt or if the
-   *     associatedData is not correct.
+   * @throws GeneralSecurityException if the header of the ciphertext is corrupt or
+   *     if associatedData is not correct.
    * @throws IOException if an IOException occurred while reading from ciphertextDestination.
    */
   SeekableByteChannel newSeekableDecryptingChannel(
@@ -162,26 +168,26 @@
       throws GeneralSecurityException, IOException;
 
   /**
-   * Returns a wrapper around {@code ciphertextSource}, such that any write-operation via the
-   * wrapper results in AEAD-encryption of the written data, using {@code additionalData} as
-   * additional authenticated data. The additional data is not included in the ciphertext and has to
-   * be passed in as parameter for decryption.
+   * Returns a wrapper around {@code ciphertextDestination}, such that any write-operation via
+   * the wrapper results in AEAD-encryption of the written data, using {@code associatedData}
+   * as associated authenticated data. The associated data is not included in the ciphertext
+   * and has to be passed in as parameter for decryption.
    */
-  InputStream newDecryptingStream(InputStream ciphertextSource, byte[] associatedData)
+  OutputStream newEncryptingStream(OutputStream ciphertextDestination, byte[] associatedData)
       throws GeneralSecurityException, IOException;
 
   /**
-   * Returns a wrapper around {@code ciphertextDestination}, such that any read-operation via the
-   * wrapper results in AEAD-decryption of the underlying ciphertext, using {@code additionalData}
-   * as additional authenticated data.
+   * Returns a wrapper around {@code ciphertextSource}, such that any read-operation
+   * via the wrapper results in AEAD-decryption of the underlying ciphertext,
+   * using {@code associatedData} as associated authenticated data.
    *
-   * <p>The returned InputStream may support {@code mark()}/{@code reset()}, but does not have to do
-   * it -- {@code markSupported()} provides the corresponding info.
+   * <p>The returned InputStream may support {@code mark()}/{@code reset()},
+   *    but does not have to do it -- {@code markSupported()} provides the corresponding info.
    *
-   * <p>The returned InputStream supports {@code skip()}, yet possibly in an inefficient way, i.e.
-   * by reading a sequence of blocks until the desired position. If a more efficient {@code
-   * skip()}-functionality is needed, the Channel-based API can be used.
+   * <p>The returned InputStream supports {@code skip()}, yet possibly in an inefficient way,
+   *    i.e. by reading a sequence of blocks until the desired position. If a more efficient
+   *    {@code skip()}-functionality is needed, the Channel-based API can be used.
    */
-  OutputStream newEncryptingStream(OutputStream ciphertextDestination, byte[] associatedData)
+  InputStream newDecryptingStream(InputStream ciphertextSource, byte[] associatedData)
       throws GeneralSecurityException, IOException;
 }
