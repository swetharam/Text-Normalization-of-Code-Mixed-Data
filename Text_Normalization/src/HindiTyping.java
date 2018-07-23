public class HindiTyping
{

    public static void SetSingleLetterRight()
    {
     for(int i=0;i<DevText.length;i++)
     {
      if(DevText[i].length()==1)
      {
          DevText[i]=DevText[i]+"a";
      }
     }
    }

 static String[] DevText={"अ","आ","इ","ई","ऒ","ओ","उ","ऊ","ऎ","ए","ऐ","व","वा","वि","वी","वॆ","वे","वॊ","वो","वु","वू","रा","रॆ","रे","रि","री","रॊ","रो","रु","रू","र्य","र्या","र्यि","र्यी","र्ये","र्यु","र्यू","र्यॊ","र्यो","त","ता","तॆ","ते","ति","ती","तॊ","तो","तु","तू","त्य","त्या","त्यॆ","त्ये","त्यु","त्यू","त्यॊ","त्यो","त्यि","त्यी","य","या","यॆ","ये","यि","यी",
"यु","यू","यॊ","यो","प","पा","पॆ","पे","पि","पी","पु","पू","पॊ","पो","प्य","प्या","प्यॆ","प्ये","प्यि","प्यी","प्यु","प्यू","प्यॊ","प्यो","प्रा","प्री","प्रि","प्रॆ","प्रे","प्रु","प्रू","प्रॊ","प्रो","प्रु","प्रू","सा","सि","सी","सु","सू","सॊ","सो","सॆ","से","स्र","स्रा","स्रि","स्री","स्रु","स्रू","स्रॊ","स्रो","स्रॆ","स्रे","स्य","स्या","स्यि","स्यी","स्यॆ","स्ये",
"स्यु","स्यू","स्यॊ","स्यो","द","दा","दि","दी","दॊ","दो","दु","दू","दॆ","दे","ध","धा","धि","धी","धॊ","धो","धु","धू","धॆ","धे","फ","फा","फि","फी","फॊ","फो","फु","फू","फॆ","फे","फ्र","फ्रा","फ्रि","फ्री","फ्रॊ","फ्रो","फ्रु","फ्रू","फ्रॆ","फ्रे","ग","गा","गि","गी","गॊ","गो","गु","गू","गॆ","गे","ग्य","ग्या","ग्यि","ग्यी","ग्यो","ग्यॊ",
"ग्यु","ग्यू","ग्यॆ","ग्ये","ग्रा","ग्रि","ग्री","ग्रॊ","ग्रो","ग्रु","ग्रू","ग्रॆ","ग्रे","घ","घा","घि","घी","घॊ","घो","घु","घू","घॆ","घे","ह","हा","हि","ही","हॊ","हो","हु","हू","हॆ","हे","ज","जा","जि","जी","जॊ","जो","जु","जू","जॆ","जे","ज्र","ज्रा","ज्रि","ज्री","ज्रॊ","ज्रो","ज्रु","ज्रू","ज्रॆ","ज्रे","ज्य","ज्या","ज्यि","ज्यी","ज्यॊ","ज्यो","ज्यु","ज्यू",
"ज्यॆ","ज्ये","झ","झा","झि","झी","झॊ","झो","झु","झू","झॆ","झे","क","का","कि","की","कॊ","को","कु","कू","कॆ","के","क्य","क्या","क्यि","क्यी","क्यॊ","क्यो","क्यु","क्यू","क्यॆ","क्ये","क्र","क्रा","क्रि","क्री","क्रॊ","क्रो","क्रु","क्रू","क्रॆ","क्रे","क्व","क्वा","क्वि","क्वी","क्वॊ","क्वो","क्वु","क्वू","क्वॆ","कवे","त्व","त्वा",
"त्वि","त्वी","त्वॊ","त्वो","त्वु","त्वू","त्वॆ","त्वे","र्व","र्वा","र्वि","र्वी","र्वु","र्वू","र्वॊ","र्वो","र्वॆ","र्वे","प्व","प्वा","प्वि","प्वी","प्वॊ","प्वो","प्वु","प्वू","प्वॆ","प्वे","स्व","स्वा","स्वि","स्वी","स्वॊ","स्वो","स्वु","स्वू","स्वॆ","स्वे","","फ्व","फ्वा","फ्वि","फ्वी","फ्वॊ","फ्वो","फ्वु","फ्वू","फ्वॆ","फ्वे","ग्व","ग्वा","ग्वि","ग्वी",
"ग्वॊ","ग्वो","ग्वु","ग्वू","ग्वॆ","ग्वे","ह्व","","ज्व","झा","ज्वि","ज्वी","ज्वॊ","ज्वो","ज्वु","ज्वू","ज्वॆ","ज्वे","ल्व","ल्वा","ल्वि","ल्वी","ल्वॊ","ल्वो","ल्वु","ल्वू","ल्वॆ","ल्वे","ल","ला","लि","ली","लॊ","लो","लु","लू","लॆ","ले","ल्र","ल्र","ल्रा","ल्रि","ल्री","ल्रॊ","ल्रो","ल्रु","ल्रू","ल्रॆ","ल्रे","ल्य","ल्या","ल्यि","ल्यी","ल्यॊ",
"ल्यो","ल्यु","ल्यू","ल्यॆ","ल्ये","ल्ह","ल्हा","ल्हि","ल्ही","ल्हॊ","ल्हो","ल्हु","ल्हू","ल्हॆ","ल्हे","क्श","क्शा","क्शि","क्शी","क्शॊ","क्शो","क्शु","क्शू","क्शॆ","क्शे","च","चा","चि","ची","चॊ","चो","चु","चू","चॆ","चे","छ","छा","छि","छी","छॊ","छो","छु","छू","छॆ","छे","छ्र्","छ्रा","छ्रि","छ्री","छ्रॊ","छ्रो","छ्रु","छ्रू","छ्रॆ",
"छ्रे","च्र्","च्रा","च्रि","च्री","च्रॊ","च्रो","च्रु","च्रू","च्रॆ","च्रे","च्य","च्या","च्यि","च्यी","च्यॊ","च्यो","च्यु","च्यू","च्यॆ","च्ये","छ्य","व","वा","वि","वी","वॊ","वो","वु","वू","वॆ","वे","व्य","व्या","व्यि","व्यी","व्यॊ","व्यो","व्यु","व्यू","व्यॆ","व्ये","व्र","व्रा","व्रि","व्री","व्रु","व्रू","व्रॊ","व्रो","व्रॆ","व्रे","व्ह","व्हा","व्हि","व्ही","व्हॊ",
"व्हो","व्हु","व्हू","व्हॆ","व्हे","ब","बा","बि","बी","बॊ","बो","बु","बू","बॆ","बे","भ","भा","भि","भी","भॊ","भो","भु","भू","भॆ","भे","भ्र","भ्रा","भ्रि","भ्री","भ्रॊ","भ्रो","भ्रु","भ्रू","भ्रॆ","भ्रे","ब्र","ब्रा","ब्रि","ब्री","ब्रॊ","ब्रो","ब्रु","ब्रू","ब्रॆ","ब्रे","न","ना","नि","नी","नु","नू","नॊ","नो","नॆ","ने","न्ह","न्हा","न्हि","न्ही","न्हॊ","न्हो","न्हु","न्हू",
"न्हॆ","न्हे","न्य","न्या","न्यु","न्यू","न्यि","न्यी","न्यॊ","न्यो","न्यॆ","न्ये","न्व","न्वा","न्वि","न्वी","न्वॊ","न्वो","न्वु","न्वू","न्वॆ","न्वे","ञ","ञा","ञि","ञी","ञॊ","ञो","ञु","ञू","ञॆ","ञे","ङ","ङा","ङि","ङी","ङॊ","ङो","ङु","ङू","ङॆ","ङे","मा","मि","मी","मॊ","मो","मु","मू","मॆ","मे","म्य","म्या","म्यि","म्यी","म्यॊ",
"म्यो","म्यु","म्यू","म्यॆ","म्ये","म्र","म्रा","म्रॊ","म्रो","म्रि","म्री","म्रु","म्रू","म्रॆ","म्रे","म्व","म्व","म्वा","म्वि","म्वी","म्वॊ","म्वो","म्वु","म्वू","म्वॆ","म्वे","है"};

 public static void main(String [] args)
    {
     /*for(int i=0;i<DevText.length;i++)
     {
         System.out.print(net.sf.junidecode.Junidecode.unidecode(DevText[i])+" ");
     }*/
        String s = "ma";
        String a = "na";
        String d = "li";
        System.out.println(EnglishToHindi(s));
        System.out.println(EnglishToHindi(a));
        System.out.println(EnglishToHindi(d));
    }

 static String [] English={
"a","aa","i","ii","o","o","u","uu","e","e","ai","v","vaa","vi","vii","ve","ve","vo","vo","vu","vuu","raa","re","re","ri","rii","ro","ro","ru","ruu","ry","ryaa","ryi","ryii","rye","ryu","ryuu","ryo","ryo","t","taa","te","te","ti","tii","to","to","tu","tuu","ty","tyaa","tye","tye","tyu","tyuu","tyo","tyo","tyi","tyii","y","yaa","ye","ye","yi","yii","yu","yuu","yo","yo","p","paa","pe","pe","pi","pii","pu","puu","po","po","py","pyaa","pye","pye","pyi","pyii","pyu","pyuu","pyo","pyo","praa","prii","pri","pre","pre","pru","pruu","pro","pro","pru","pruu","saa","si","sii","su","suu","so","so","se","se","sr","sraa","sri","srii","sru","sruu","sro","sro","sre","sre","sy","syaa","syi","syii","sye","sye","syu","syuu","syo","syo","d","daa","di","dii","do","do","du","duu","de","de","dh","dhaa","dhi","dhii","dho","dho","dhu","dhuu","dhe","dhe","ph","phaa","phi","phii","pho","pho","phu","phuu","phe","phe","phr","phraa","phri","phrii","phro","phro","phru","phruu","phre","phre","g","gaa","gi","gii","go","go","gu","guu","ge","ge","gy","gyaa","gyi","gyii","gyo","gyo","gyu","gyuu","gye","gye","graa","gri","grii","gro","gro","gru","gruu","gre","gre","gh","ghaa","ghi","ghii","gho","gho","ghu","ghuu","ghe","ghe","h","haa","hi","hii","ho","ho","hu","huu","he","he","j","jaa","ji","jii","jo","jo","ju","juu","je","je","jr","jraa","jri","jrii","jro","jro","jru","jruu","jre","jre","jy","jyaa","jyi","jyii","jyo","jyo","jyu","jyuu","jye","jye","jh","jhaa","jhi","jhii","jho","jho","jhu","jhuu","jhe","jhe","k","kaa","ki","kii","ko","ko","ku","kuu","ke","ke","ky","kyaa","kyi","kyii","kyo","kyo","kyu","kyuu","kye","kye","kr","kraa","kri","krii","kro","kro","kru","kruu","kre","kre","kv","kvaa","kvi","kvii","kvo","kvo","kvu","kvuu","kve","kve","tv","tvaa","tvi","tvii","tvo","tvo","tvu","tvuu","tve","tve","rv","rvaa","rvi","rvii","rvu","rvuu","rvo","rvo","rve","rve","pv","pvaa","pvi","pvii","pvo","pvo","pvu","pvuu","pve","pve","sv","svaa","svi","svii","svo","svo","svu","svuu","sve","sve","","phv","phvaa","phvi","phvii","phvo","phvo","phvu","phvuu","phve","phve","gv","gvaa","gvi","gvii","gvo","gvo","gvu","gvuu","gve","gve","hv","","jv","jhaa","jvi","jvii","jvo","jvo","jvu","jvuu","jve","jve","lv","lvaa","lvi","lvii","lvo","lvo","lvu","lvuu","lve","lve","l","laa","li","lii","lo","lo","lu","luu","le","le","lr","lr","lraa","lri","lrii","lro","lro","lru","lruu","lre","lre","ly","lyaa","lyi","lyii","lyo","lyo","lyu","lyuu","lye","lye","lh","lhaa","lhi","lhii","lho","lho","lhu","lhuu","lhe","lhe","ksh","kshaa","kshi","kshii","ksho","ksho","kshu","kshuu","kshe","kshe","c","caa","ci","cii","co","co","cu","cuu","ce","ce","ch","chaa","chi","chii","cho","cho","chu","chuu","che","che","chr","chraa","chri","chrii","chro","chro","chru","chruu","chre","chre","cr","craa","cri","crii","cro","cro","cru","cruu","cre","cre","cy","cyaa","cyi","cyii","cyo","cyo","cyu","cyuu","cye","cye","chy","v","vaa","vi","vii","vo","vo","vu","vuu","ve","ve","vy","vyaa","vyi","vyii","vyo","vyo","vyu","vyuu","vye","vye","vr","vraa","vri","vrii","vru","vruu","vro","vro","vre","vre","vh","vhaa","vhi","vhii","vho","vho","vhu","vhuu","vhe","vhe","b","baa","bi","bii","bo","bo","bu","buu","be","be","bh","bhaa","bhi","bhii","bho","bho","bhu","bhuu","bhe","bhe","bhr","bhraa","bhri","bhrii","bhro","bhro","bhru","bhruu","bhre","bhre","br","braa","bri","brii","bro","bro","bru","bruu","bre","bre","n","naa","ni","nii","nu","nuu","no","no","ne","ne","nh","nhaa","nhi","nhii","nho","nho","nhu","nhuu","nhe","nhe","ny","nyaa","nyu","nyuu","nyi","nyii","nyo","nyo","nye","nye","nv","nvaa","nvi","nvii","nvo","nvo","nvu","nvuu","nve","nve","ny","nyaa","nyi","nyii","nyo","nyo","nyu","nyuu","nye","nye","ng","ngaa","ngi","ngii","ngo","ngo","ngu","nguu","nge","nge","maa","mi","mii","mo","mo","mu","muu","me","me","my","myaa","myi","myii","myo","myo","myu","myuu","mye","mye","mr","mraa","mro","mro","mri","mrii","mru","mruu","mre","mre","mv","mv","mvaa","mvi","mvii","mvo","mvo","mvu","mvuu","mve","mve","hai"};

 public static String EnglishToHindi(String english)
    {
     for(int i=0;i<DevText.length;i++)
     {
         if(English[i].equals(english))
            return DevText[i];
     }
     return "";
    }

  public static String Hindi2English(String hindi)
    {
     for(int i=0;i<DevText.length;i++)
     {
         if(English[i].equals(hindi))
            return English[i];
     }
     return "";
    }

}