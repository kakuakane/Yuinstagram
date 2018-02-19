package com.example.demo.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetImgService {
    public List<String> pickup() throws IOException {
        URL url = new URL("https://www.instagram.com/yui_ogura_official/?hl=ja");
        String source = getSourceText(url);
        String regex = "(https://[\\w/:%#&~=_!'\\$\\?\\(\\)\\.\\+\\*\\-]+s640x640[\\w/:%#&~=_!'\\$\\?\\(\\)\\.\\+\\*\\-]+)";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(source);

        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group(1));
        }

        return list;

    }

    public List<String> pickup(boolean isText) {
        String[] imgArray = imgSrc.split("\n");
        return Arrays.asList(imgArray);

    }

    private static String getSourceText(URL url) throws IOException {
        InputStream in = url.openStream();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));
            String s = "";
            while ((s = bf.readLine()) != null) {
                sb.append(s);
            }
        } finally {
            in.close();
        }
        return sb.toString();
    }

    private String imgSrc = "https://scontent-nrt1-1.cdninstagram.com/vp/89a8ea2bf72ebcfc55adf3cc75a79486/5B27232B/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/27580105_341001213080655_5528539937009303552_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/635bf5f8245ffa162d5b0659a421720e/5B177C60/t51.2885-15/s640x640/sh0.08/e35/c135.0.810.810/27878970_185484385546603_6927285823243026432_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/9655bb5e152087816952f20cf4cca9f1/5B20F358/t51.2885-15/s640x640/sh0.08/e35/27576452_201675687245230_2402029553426890752_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/987d870cfb7e2f02c15219e972fa7aba/5B178F51/t51.2885-15/s640x640/sh0.08/e35/c135.0.810.810/27579368_2100212010207938_3884069020332195840_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/4d99e91a2ddb2bbbba6bbfb4d13a7bc0/5B011DB4/t51.2885-15/s640x640/sh0.08/e35/27576390_742334029288694_1061271377866129408_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/1913d63b672f6ffa2886e2c33f13f194/5B027BCF/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26870709_148367155968437_6145234044566110208_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/c9822f321156a9648689e4edc7e97cd6/5B12D220/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26868126_1562207820553622_4977747086087815168_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/916996ce4115e4a21822ba941ccbcc49/5B03A141/t51.2885-15/s640x640/sh0.08/e35/26871464_1571743432904237_6715965757173268480_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/634f0bb8d084c1c3a1e9600e9b1ee1a3/5B1618EC/t51.2885-15/s640x640/sh0.08/e35/27578883_933571706791111_6665130253674872832_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/12ea9f5576531778900b0fcda6b4ed7b/5B1342A9/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26870118_196013884324115_599541580134612992_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/9689e69bcda49555673e7c615afd30a4/5B15596C/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26868364_367815930356783_2331416335415771136_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/b50bea2dee7e666a6e18aa6b093c973a/5B203177/t51.2885-15/s640x640/sh0.08/e35/c135.0.810.810/26157200_579497062393375_1962698942151917568_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/1ba51f93d47afddffc539c1ea8b0a01b/5B24760E/t51.2885-15/s640x640/sh0.08/e35/c135.0.810.810/26275921_1774100102899880_985119176756559872_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/29b7c52bd4297d97d1873dbd6bbfba4b/5B0996F3/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26868315_150223198974067_5364816582549700608_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/5d8918e8178870e274708559f11c36be/5B1D725A/t51.2885-15/s640x640/sh0.08/e35/26152409_191196598129134_9088198708696186880_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/47b3598f24467c946b8ea757fdefab22/5B1E5C33/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26185822_1178091292321969_5855150617659441152_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/d2f6bc1640282218a8cb2e0412893c09/5B14A8D5/t51.2885-15/s640x640/sh0.08/e35/26322241_179151799353110_6557646472299413504_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/7d90f749d2f1ad5da4efa29874501064/5B10D552/t51.2885-15/s640x640/sh0.08/e35/26067153_184425602148344_2232097669122097152_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/d447120ad0531202c8933f1f0bcffd7e/5B0EDFED/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26066716_1804392016247054_9196920578819227648_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/f6a1c4d59a4e6b606c4267396b8ce54c/5B09AA7A/t51.2885-15/s640x640/sh0.08/e35/26157259_555738784761762_4822619541735473152_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/c95f82122cafc3a70aef9ca0f4a3709d/5B1ACBBD/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/25035833_888793791289806_2451757930320494592_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/6c15d3f59da64611b8a3e70c0e520b22/5B0927BD/t51.2885-15/s640x640/sh0.08/e35/26068579_964791807002173_3397277671816691712_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/cf8a8550c6a8df47d4e02a3f3c8e5415/5B0B2452/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/25023894_784966938370394_8666456770182381568_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/89a8ea2bf72ebcfc55adf3cc75a79486/5B27232B/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/27580105_341001213080655_5528539937009303552_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/635bf5f8245ffa162d5b0659a421720e/5B177C60/t51.2885-15/s640x640/sh0.08/e35/c135.0.810.810/27878970_185484385546603_6927285823243026432_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/9655bb5e152087816952f20cf4cca9f1/5B20F358/t51.2885-15/s640x640/sh0.08/e35/27576452_201675687245230_2402029553426890752_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/987d870cfb7e2f02c15219e972fa7aba/5B178F51/t51.2885-15/s640x640/sh0.08/e35/c135.0.810.810/27579368_2100212010207938_3884069020332195840_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/4d99e91a2ddb2bbbba6bbfb4d13a7bc0/5B011DB4/t51.2885-15/s640x640/sh0.08/e35/27576390_742334029288694_1061271377866129408_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/1913d63b672f6ffa2886e2c33f13f194/5B027BCF/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26870709_148367155968437_6145234044566110208_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/c9822f321156a9648689e4edc7e97cd6/5B12D220/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26868126_1562207820553622_4977747086087815168_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/916996ce4115e4a21822ba941ccbcc49/5B03A141/t51.2885-15/s640x640/sh0.08/e35/26871464_1571743432904237_6715965757173268480_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/634f0bb8d084c1c3a1e9600e9b1ee1a3/5B1618EC/t51.2885-15/s640x640/sh0.08/e35/27578883_933571706791111_6665130253674872832_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/12ea9f5576531778900b0fcda6b4ed7b/5B1342A9/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26870118_196013884324115_599541580134612992_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/9689e69bcda49555673e7c615afd30a4/5B15596C/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26868364_367815930356783_2331416335415771136_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/b50bea2dee7e666a6e18aa6b093c973a/5B203177/t51.2885-15/s640x640/sh0.08/e35/c135.0.810.810/26157200_579497062393375_1962698942151917568_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/1ba51f93d47afddffc539c1ea8b0a01b/5B24760E/t51.2885-15/s640x640/sh0.08/e35/c135.0.810.810/26275921_1774100102899880_985119176756559872_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/29b7c52bd4297d97d1873dbd6bbfba4b/5B0996F3/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26868315_150223198974067_5364816582549700608_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/5d8918e8178870e274708559f11c36be/5B1D725A/t51.2885-15/s640x640/sh0.08/e35/26152409_191196598129134_9088198708696186880_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/47b3598f24467c946b8ea757fdefab22/5B1E5C33/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26185822_1178091292321969_5855150617659441152_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/d2f6bc1640282218a8cb2e0412893c09/5B14A8D5/t51.2885-15/s640x640/sh0.08/e35/26322241_179151799353110_6557646472299413504_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/7d90f749d2f1ad5da4efa29874501064/5B10D552/t51.2885-15/s640x640/sh0.08/e35/26067153_184425602148344_2232097669122097152_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/d447120ad0531202c8933f1f0bcffd7e/5B0EDFED/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/26066716_1804392016247054_9196920578819227648_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/f6a1c4d59a4e6b606c4267396b8ce54c/5B09AA7A/t51.2885-15/s640x640/sh0.08/e35/26157259_555738784761762_4822619541735473152_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/c95f82122cafc3a70aef9ca0f4a3709d/5B1ACBBD/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/25035833_888793791289806_2451757930320494592_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/6c15d3f59da64611b8a3e70c0e520b22/5B0927BD/t51.2885-15/s640x640/sh0.08/e35/26068579_964791807002173_3397277671816691712_n.jpg\n"
            + "https://scontent-nrt1-1.cdninstagram.com/vp/cf8a8550c6a8df47d4e02a3f3c8e5415/5B0B2452/t51.2885-15/s640x640/sh0.08/e35/c0.135.1080.1080/25023894_784966938370394_8666456770182381568_n.jpg\n";
}
