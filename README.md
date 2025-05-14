#Kriptimi_Hill

Kriptimi Hill është kriptim klasik simetrik qe bazohet në algjebrën lineare, konkretisht në përdorimin e matricave për të koduar dhe dekoduar mesazhe.
Si  funksionon Kriptimi Hill?
-Mesazhi ndahet ne blloqe shkronjash, zakonisht me gjatësi 2 ose 3(varësisht nga madhësia e matrices).
-Cdo shkronjë konvertohet në numër, zakonisht sipas alfabetit(A=0, B=1, ...,Z=25).
-Përdoret një matricë çelës (key matrix) për të shumëzuar këto blloqe numrash.
-Rezultati modulo 26 (sepse ka 26 shkronja në alfabetin anglisht) jep kodimin.
-Për dekodim, përdoret inversa e matricës çelës (gjithashtu modulo 26).

Metoda encrypt
Kjo metodë realizon kriptimin e një mesazhi duke përdorur algoritmin Hill Cipher, i cili bazohet në shumëzimin e një blloku karakteresh me një matricë.
Parametrat:
input: Teksti origjinal që do të enkriptohet.
keyMatrix: Matrica kyç e përmasave n x n që përdoret për kriptim.
n: Dimensioni i matricës dhe madhësia e blloqeve që ndahen nga teksti.
Procesi:
Teksti konvertohet në shkronja të mëdha dhe pastrohet nga karakteret jo-alfabetike.
Shtohet padding X për të siguruar që gjatësia të jetë shumëfish i n.
Teksti ndahet në blloqe me n shkronja.
Çdo bllok konvertohet në vektor numerik A=0-Z=25 dhe enkriptohet me matricën keyMatrix.
Rezultati kthehet si një string i enkriptuar.
Kjo metodë punon vetëm për alfabetin anglisht (A-Z) dhe supozon se matrica kyç është e vlefshme për enkriptim në Hill Cipher.


