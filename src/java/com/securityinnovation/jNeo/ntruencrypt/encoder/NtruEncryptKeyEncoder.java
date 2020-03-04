/*
 * **************************************************************************** NTRU Cryptography
 * Reference Source Code
 *
 * <p>Copyright (C) 2009-2016 Security Innovation (SI)
 *
 * <p>SI has dedicated the work to the public domain by waiving all of its rights to the work
 * worldwide under copyright law, including all related and neighboring rights, to the extent
 * allowed by law.
 *
 * <p>This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. You can
 * copy, modify, distribute and perform the work, even for commercial purposes, all without asking
 * permission. You should have received a copy of the creative commons license (CC0 1.0 universal)
 * along with this program. See the license file for more information.
 *
 * <p>*******************************************************************************
 */
package com.securityinnovation.jNeo.ntruencrypt.encoder;

import com.securityinnovation.jNeo.FormatNotSupportedException;
import com.securityinnovation.jNeo.ParamSetNotSupportedException;
import com.securityinnovation.jNeo.math.FullPolynomial;
import com.securityinnovation.jNeo.ntruencrypt.KeyParams;

public interface NtruEncryptKeyEncoder {
  /* Encode a public key as a byte array. */
  byte[] encodePubKey(KeyParams keyParams, FullPolynomial h);

  /* Encode a private key as a byte array. */
  byte[] encodePrivKey(KeyParams keyParams, FullPolynomial h, FullPolynomial f);

  /* Parse a public or private key blob. */
  RawKeyData decodeKeyBlob(byte[] keyBlob)
      throws FormatNotSupportedException, ParamSetNotSupportedException;
}
