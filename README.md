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

Metoda main
Metoda main është pika hyrëse e programit dhe përmban logjikën për ndërveprimin me përdoruesin. Ajo kryen hapat e mëposhtëm:
Zgjedhja e dimensionit të matricës:
Përdoruesi kërkohet të japë një numër ndërmjet 2 dhe 4, i cili përcakton dimensionin n x n të matricës kyç që do të përdoret për kriptim. Nëse jepet një vlerë jashtë intervalit të lejuar, shfaqet një mesazh gabimi dhe kërkohet inputi sërish.
Leximi i matricës kyç (keyMatrix):
Pasi caktohet dimensioni n, programi përdor një metodë ndihmëse (readMatrix) për të lexuar nga përdoruesi elementët e matricës kyç me përmasa n x n.
Marrja e tekstit për kriptim:
Përdoruesi kërkohet të fusë një tekst që përmban vetëm shkronja nga A deri në Z (pa hapësira, numra apo simbole të tjera).
Teksti konvertohet automatikisht në shkronja të mëdha.
Nëse inputi përmban karaktere të palejuara, shfaqet një mesazh gabimi dhe kërkohet input i vlefshëm.
Procesi i kriptimit:
Teksti i vlefshëm kriptohet duke përdorur metodën encrypt, e cila aplikon algoritmin Hill Cipher mbi tekstin, bazuar në matricën kyç të futur më herët.
Shfaqja e rezultatit:
Teksti i koduar (i kriptuar) shfaqet në ekran.

Tek metoda readMatrix
Funksioni readMatrix përdoret për të lexuar një matricë katrore me madhësi n x n nga tastiera. Fillimisht, krijohet një matricë bosh int[][] matrix = new int[n][n] që do të mbushet me vlerat qe jep përdoruesi. Pastaj shfaqet një mesazh në ekran që kërkon nga përdoruesi të jap elementët e matricës. Me anë të dy cikleve for, njëri për rreshtat dhe tjetri për kolonat, lexohen të gjitha vlerat një nga një duke përdorur sc.nextInt() dhe vendosen në pozicionin përkatës të matricës matrix[i][j]. Pasi të jenë lexuar të gjitha vlerat, matrica e plotësuar kthehet si rezultat i funksionit. 

Metoda Main
Ky kod ka të bëjë me strukturën për një enkriptim me algoritmin Hill Cipher, ku fillimisht caktohet moduli 26 për të përfaqësuar shkronjat e alfabetit anglez, funksioni charToNum kthen një shkronjë të madhe në numrin përkatës nga 0 deri në 25, ndërsa numToChar kthen një numër nga 0 në 25 në shkronjën përkatëse të alfabetit, dhe funksionet encryptBlock dhe encrypt janë të shpallura por të papërfunduara, ku i pari do të bëjë shumëzimin e një blloku të tekstit (i shndërruar në numra) me matricën çelës për të krijuar tekstin e koduar, ndërsa i dyti do të përpunojë tekstin e plotë duke e ndarë në blloqe të vegjël dhe duke thirrur funksionin encryptBlock për secilin bllok, dhe më në fund funksioni main është i zbrazët, që do të thotë se aktualisht programi nuk kryen ndonjë funksion kur ekzekutohet.

Metoda encryptBlock
Kjo metodë përbën bërthamën e procesit të enkriptimit në algoritmin Hill Cipher, duke realizuar transformimin matematikor të një blloku karakteresh
i cili më parë është shndërruar në vektor numerik, përmes shumëzimit me matricën kyç.






