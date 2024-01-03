package com.cat.crudapi.service;

import com.cat.crudapi.entity.Cat;
import com.cat.crudapi.repositry.CatMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CatServiceImplTest {
    @InjectMocks
    CatServiceImpl catServiceImpl;

    @Mock
    CatMapper catMapper;

    @Test
    public void findAllで存在する全てのデータが取得できること() {
        // 事前準備
        doReturn(List.of(new Cat(1, "Roku", "黒", "2019/6/9", "ちゅ〜る贅沢まぐろ味"),
                new Cat(2, "Tom", "グレー＆白", "2022/4/10", "またたびスナック"),
                new Cat(3, "Lucca", "茶＆白", "2022/7/10", "ロイヤルカナンのパウチ"),
                new Cat(4, "Bungaku", "黒＆白", "2022/9/15", "にぼし"),
                new Cat(5, "Hinata", "茶＆白", "2022/9/15", "鰹節"))).when(catMapper).findAll();

        // テスト実行
        List<Cat> actual = catServiceImpl.findAll();

        // 期待する結果
        assertThat(actual).isEqualTo(List.of(new Cat(1, "Roku", "黒", "2019/6/9", "ちゅ〜る贅沢まぐろ味"),
                new Cat(2, "Tom", "グレー＆白", "2022/4/10", "またたびスナック"),
                new Cat(3, "Lucca", "茶＆白", "2022/7/10", "ロイヤルカナンのパウチ"),
                new Cat(4, "Bungaku", "黒＆白", "2022/9/15", "にぼし"),
                new Cat(5, "Hinata", "茶＆白", "2022/9/15", "鰹節")));
        verify(catMapper).findAll();
    }


    @Test
    public void findCatIdでIDに紐づくデータが1件取得できること() {
        doReturn(Optional.of(new Cat(1, "Roku", "黒", "2019/6/9", "ちゅ〜る贅沢まぐろ味"))).when(catMapper).findCatId(1);

        Cat actual = catServiceImpl.findCatId(1);

        assertThat(actual).isEqualTo(new Cat(1, "Roku", "黒", "2019/6/9", "ちゅ〜る贅沢まぐろ味"));
        verify(catMapper).findCatId(1);
    }
}
