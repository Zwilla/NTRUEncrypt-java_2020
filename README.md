## Table of Contents ntru-crypto
* [Ebooks](#ebooks)
* [Key Contacts](#key-contacts)
  * [None official](#none-official)
* [Project Overview](#project-overview)

* [FAQ](#faq)
  * [What is NTRU?](#what-is-ntru)
  * [What makes NTRU fast?](#what-makes-ntru-fast)
  * [Which applications/industries would benefit most from NTRU?](#which-applicationsindustries-would-benefit-most-from-ntru)
  * [What makes NTRU quantum computing resistant?](#what-makes-ntru-quantum-computing-resistant)
  * [What business problem does NTRU solve?](#what-business-problem-does-ntru-solve)
  * [What is NTRU's history and peer review?](#what-is-ntrus-history-and-peer-review)
  * [How fast is NTRU?](#how-fast-is-ntru)
  * [Has NTRU's speed been verified by third parties?](#has-ntrus-speed-been-verified-by-third-parties)
  * [Has NTRU been standardized?](#has-ntru-been-standardized)
  * [Is NTRU Patented?](#is-ntru-patented)
  * [Why has NTRU been open source licensed?](#why-has-ntru-been-open-source-licensed)
  * [Are there any commercial licenses available?](#are-there-any-commercial-licenses-available)
  * [Is replacing RSA with NTRU the best solution moving forward?](#i-read-that-ntru-doesnt-always-decrypt-properly-is-that-true)
  * [Doesn't open sourcing make NTRU implementations more vulnerable to hackers?](#doesnt-open-sourcing-make-ntru-implementations-more-vulnerable-to-hackers)
  * [I read that NTRU doesn't always decrypt properly. Is that true?](#i-read-that-ntru-doesnt-always-decrypt-properly-is-that-true)
  * [Where can I get more technical information?](#where-can-i-get-more-technical-information)


* [Quantum computers essentially halve the bit strength of AES, SHA and NTRU.](#quantum-computers-essentially-halve-the-bit-strength-of-aes-sha-and-ntru)
* [Ebooks](#ebooks)

Open Source NTRU Public Key Cryptography Algorithm and Reference Code

## Key Contacts

* Dr. William Whyte
* Dr. Mark Etzel
* Mr. Peter Jenney

### None official
* for this Java lib Repro <Michael.Padilla@zwilla.de>

Contacts may be reached by sending mail to [ntru-crypto@securityinnovation.com](mail://ntru-crypto@securityinnovation.com)

## Project Overview
Security Innovation, Inc., the owner of the NTRU public key cryptography system, made the intellectual property and a
sample implementation available under the Gnu Public License (GPL) in 2013 with the goal of enabling more widespread
adoption of this superior cryptographic technology. The system is also available for commercial use under the terms of
the Security Innovation Commercial License.


NTRU represents a significant improvement in the Public Key cryptography world---it's faster, stronger and smaller
than virtually any other system in use and it's quantum computer resistant, making it the best choice for current
projects with lifetimes that extend into the post quantum computer age.


"The open source licensing of the NTRU crypto system will make it even easier for wide-spread adoption of our X9.98
standard, allowing Financial Services companies to protect their important financial transactions",
said executive director Cynthia Fuller of Accredited Standards Committee X9 -Financial Industry Standards.


For additional overview information click
[https://www.securityinnovation.com](https://www.securityinnovation.com/products/encryption-libraries/ntru-cryptography.html)


## FAQ

### What is NTRU?
NTRU is a lattice-based public key cryptosystem from Security Innovation and the leading alternative to RSA and Elliptic
Curve Cryptography (ECC) due to its higher performance and resistance to attacks from quantum computers.
NTRU was developed in 1996 as a visionary solution to cyber security challenges for the twenty-first century.
NTRU is based on a mathematical problem called the "Approximate close lattice vector problem" and comprises
three algorithms:  NTRUEncrypt, NTRUSign, and PASSSign.  It has been reviewed and published in scholarly journals
and presented at Crypto, Eurocrypt, and RSA, and has been adopted in IEEE and X9 standards.


### What makes NTRU fast?
Because it is based on different math from RSA and ECC, the NTRU algorithm has different cryptographic properties.
At comparable cryptographic strength, NTRU performs costly private key operations much faster than RSA or ECC.
In addition, NTRU's comparative performance increases with the level of security required.  As key sizes increase by a 
factor of n, RSA's operations/second decrease by about n3 whereas NTRU's decrease at n2.


### Which applications/industries would benefit most from NTRU?
Any application that requires fast performance (large amounts of data to be protected in a short amount of time) and/or 
high-levels of security for the next 10 years would benefit from the NTRU solution.  Furthermore, the small code size 
(small footprint) of the NTRU implementations make it suitable for even small embedded processors.


These applications include Payment Systems,  secure messaging and email, mobile eCommerce, Healthcare, 
Near Field Communications (NFC), Vehicle Communications (V2V, V2I), Military/Aerospace, Web Browsers and Servers, 
Remote Backup Solutions, Voice over IP (VoIP), Online Presentations/Virtual Classrooms, Infrastructure
(Railway switching, Traffic lights, etc), Utility meters and Cloud Provides/Datacenters.

### What makes NTRU quantum computing resistant?
NTRU is currently not known to be vulnerable to algorithms based on quantum computers, unlike RSA or its other challenger, 
Elliptic Curve Cryptography. A working, full-scale quantum computer running the process known as "Shor's algorithm"
would be able to break RSA or ECC of any practical size in negligible time. In contrast, NTRU's security is reduced
only slightly by quantum computers. This has been validated by external reviewers such as the National Institute of 
Standards and Technology (NIST), who in a 2009 survey referenced NTRU as justification for the statement that 
"there are viable alternatives for both public key encryption and signatures that are not vulnerable to Shor's Algorithm".


### What business problem does NTRU solve?
We're providing a data protection solution that can help ensure long-term privacy of internet and financial transactions,
something that has been compromised lately with RSA/ECC. Industry needs a better and more transparent secure data 
communications solution, both now and in the future.


NTRU can improve communication efficiency while enhancing data security. The most commonly used encryption solution (RSA)
is painfully slow, especially with the larger keys that are required for acceptable security standards.
Rather than slow down data transmission, businesses today often choose to not protect all of their data.


NTRU on the other hand, provides much stronger security with substantially better performance. 
Higher performing NTRU encryption requires fewer servers while still protecting (encrypting) all data. 
If you are encrypting all transactions with a secure algorithm, the damage caused by intrusions can be significantly 
lessened.  


Secure encryption reduces the chances of costly data breaches, improves privacy and compliance and saves money by 
reducing the need for some intrusion detection systems and other security solutions.

### What is NTRU's history and peer review?
NTRU was invented in 1996 based on a completely different mathematical problems from RSA and Elliptic Curve called the 
"Approximate close lattice vector problem."  It has been published, reviewed in scholarly journals, and presented at
Crypto, Eurocrypt, RSA. The NTRU approach to lattice-based cryptography, which uses a particular type of lattice known 
as an "ideal lattice", has been a catalyst for the development of other efficient lattice-based cryptographic primitives,
most notably Gentry's approach to fully homomorphic encryption.


There have been more than 20 reports [read more...](https://securityinnovation.com/security-lab/crypto/402.-security-ntru-encrypt.html)
issued regarding the NTRU algorithm over the past 16 years.  This research came from academic institutions, including 
Brown University, L'École normale supérieure (ENS), University of California San Diego, and Shanghai Jiaotong University.
This secrurity has led to even stronger parameter choices and hardened implementations.  
Now that NTRU is available under an open source license, the algorithm will receive even more testing.


### How fast is NTRU?
At comparable cryptographic strength, NTRU performs private key operations 20x to 200x faster than openSSL RSA.  
Faster means less processing time (cheaper) and offers the ability to encrypt more data (more secure).  
In addition, as key sizes (security levels) increase by n, RSA's operations/second decrease at a rate of n3 whereas 
NTRU's decrease at n2. A University of Leuven [read more...](http://link.springer.com/chapter/10.1007%2F978-3-642-11925-5_6) 
report states "NTRU is extremely fast on parallelizable processors."  
Ari Juels, Chief Scientist, RSA Labs stated, "[NTRU](https://amzn.to/2PMv0UL) is considerably faster; that is something we acknowledge"
[read more...](http://www.networkworld.com/news/2011/042011-ntrue-algorithm-x9.html)


|          |               |      |          |       |               |          |     |     |
|:---------|:--------------|:-----|:---------|:------|:--------------|:---------|:----|:----|
| Security | NTRU Key Size |      | ECC      | RSA   | NTRU Ops/Sec. | ECC      | RSA |     |
| Level    | Std.          | Opt. | Key Size | Std.  | Opt.          | Ops/Sec. |     |     |
| 112      | 5951          | 4411 | 224      | 2048  | 2284          | 10638    | 951 | 156 |
| 128      | 6743          | 4829 | 256      | 4096  | 1896          | 9901     | 650 | 12  |
| 192      | 9757          | 6523 | 384      | 7680  | 1034          | 6849     | 285 | 8   |
| 256      | 12881         | 8173 | 512      | 15360 | 638           | 5000     | 116 | 1   |


Much of the performance impact in SSL comes from the use of public key cryptography, which is used to initiate 
new sessions (session "handshakes").  During session handshakes, the main public key activity consuming server
resources is decryption of the session key provided by each client.  Performance increases in decryption have a 
significant impact on server performance. At current levels of activity, for a server using NTRU, the server time 
spent peforming public key cryptography will become negligible.


### Has NTRU's speed been verified by third parties?
Yes.  The Department of Electrical Engineering at the University of Leuven released a report entitled Speed 
records for NTRU. in which they write: "NTRU is extremely fast on parallelizable processors."

### Has NTRU been standardized?
NTRU has been adopted by two standards bodies, IEEE and the Financial Services Industry's Accredited Standards Committee X9.
a.	IEEE P1363 Working Group for Standards In Public Key Cryptography [read more...](http://grouper.ieee.org/groups/1363/lattPK/index.html).
b.	X9.98 Lattice-Based Polynomial Public Key Establishment Algorithm for the Financial Services Industry.


"This standard specifies the use of the NTRUEncrypt algorithm to establish secure communications for financial
services. ... X9.98 marks a particularly significant step forward in improving the robustness of systems based on X9
standards: it allows the deployment of systems that are protected against quantum computing attacks as well as against 
classical attacks."


Additionally, an Internet Draft standardizing NTRU-based ciphersuites in Transport Layer Security (TLS) is 
currently progressing through the Internet Engineering Task Force (IETF)

### Is NTRU Patented?
Yes. The patents will still be enforced but may be used under the GPL, i.e. under the condition that any work that uses 
them is also made available under the GPL. The patents and the code implementations are also available under 
standard commercial terms.


### Why has NTRU been open source licensed?
By offering NTRU source code and patents under the Gnu Public License (GPL) v2 or higher, we are intending to remove 
barriers to widespread deployment. We want to enable the developers of the open-source software that powers the internet
to test, use, deploy, and start transitioning to fast, future-proof cryptography. Recent revelations and speculation 
about NSA influence on both crypto algorithms and crypto implementations have made it clear that the security community
desperately needs alternatives to existing crypto solutions.


Making NTRU open-source also removes barriers to testing of both the algorithm and the implementation. 
Open security and testing is the only way to instill confidence in any encryption solution.

Furthermore, the open source licensing allows users to implement the NTRU algorithm in other languages and for other 
operating systems beyond those we currently support.

### Are there any commercial licenses available?
For commercial (not open source) applications, Security Innovation offers a commercial license (see repository) that is 
not limited to use in open source applications only.


### Is replacing RSA with NTRU the best solution moving forward?
We don't think a single encryption solution is the best idea, regardless of the algorithm.
Double encryption using two fast algorithms such as NTRU plus another post-quantum crypto algorithm, or even ECC, 
would provide far greater security at a considerable higher performance than RSA alone today.
Our Chief Scientist, William Whyte, wrote a blog post on this subject. 
[read more...](http://blog.securityinnovation.com/blog/2013/08/king-rsa-cryptos-successor-why-we-need-to-move-away-from-a-monarchy.html)

### Doesn't open sourcing make NTRU implementations more vulnerable to hackers?
On the contrary:  NTRU has been tested by several external groups in addition to the commercial implementations over 
the past 10 years. By exposing it to even more users, the strength of the algorithm will be proven and the 
implementations will be strengthened.  Hiding behind a veil of patents and licensing does not equate to greater or 
lesser security.  The underlying strength of the algorithm is unaffected by the chosen licensing model.
In the event of any vulnerability being discovered in a particular implementation of the crypto algorithm, 
open source software allows users to build in short-term mitigation defenses to protect themselves until the 
vulnerability is fixed.  We feel this situation is better than leaving users exposed and unaware.


### I read that NTRU doesn't always decrypt properly. Is that true?
With NTRU, there's a tradeoff to be made in terms of the parameter q. 
The larger q is, the larger keys and ciphertexts are; the smaller it is, the greater the chance that a valid 
ciphertext will fail to decrypt. An attacker learns information from these decryption failures, so it's important to 
stop this happening.


For sufficiently large q, there will be no decryption failures at all, and in fact some sets of
NTRU parameters have had this property. However, it's not necessary to go this far. In practice, we can choose q for a 
security level of k bits so that the chance of a decryption failure is 2^-k. There's no need for a higher level of 
protection against decryption failures, because once the decryption failure probability drops below 2^-k, the attacker 
will simply choose a different attack method. This choice of q gives the optimum size parameters for a given security 
level. So the answer to "Does NTRU decrypt correctly now?" is "Yes!" (except with negligible probability).


### Where can I get more technical information?
Go to [https://www.securityinnovation.com](https://www.securityinnovation.com/products/encryption-libraries/ntru-crypto/ntru-resources.html) 
which is where we've collected a boatload of content on NTRU including NIST reports, the math and other very useful stuff.

## Quantum computers essentially halve the bit strength of AES, SHA and NTRU.
![Quantum_computers_Algo_Parameters](doc/images/Quantum_computers_Algo_Parameters.png)


## Ebooks

* [Selected Areas in Cryptography – SAC 2017:(English Edition) ](https://amzn.to/2PMv0UL)
* [Selected Areas in Cryptography: 7th Annual International Workshop, SAC 2000](https://amzn.to/2vJ0gNH)
* [Die Entwicklung eines neuen Kryptosystems am Beispiel NTRU: Probleme und Chancen (Deutsch)](https://amzn.to/38tIZFE)



[Introduction_To_NTRU_Cryptography_for_Java.pdf](doc/Introduction_To_NTRU_Cryptography_for_Java.pdf)

[Diplomarbeit_Die-Entwicklung-eines-neuen-Kryptosystems-am-Beispiel-NTRU_Probleme_und_Chancen.pdf](doc/Diplomarbeit_Die-Entwicklung-eines-neuen-Kryptosystems-am-Beispiel-NTRU_Probleme_und_Chancen.pdf)

[ntru-orig.pdf](doc/ntru-orig.pdf)

[Table of Contents ntru-crypto](#table-of-contents-ntru-crypto)
