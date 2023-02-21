package com.example.lesson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lesson.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {

private ArrayList<Country> countryList;

private Integer position;

private FragmentSecondBinding binding;

    private CountryAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("Key");
        checkPosition(position);
        adapter = new CountryAdapter(countryList);
        binding.recyclerView.setAdapter(adapter);





    }

    private void checkPosition(Integer position) {
        if (position == 0){
            loadAustralia();

        } else if (position == 1) {

            loadAfrica();

        } else if (position == 2) {

            loadEurasia();
        } else if (position == 3) {

            loadSouthAmerica();
        } else if (position == 4) {

            loadNorthAmerica();
        }
    }

    private void loadNorthAmerica() {
        countryList = new ArrayList<>();

        countryList.add(new Country("Bagamy", "https://militaryarms.ru/wp-content/uploads/2021/09/og_og_1543047023261164165.jpg", "Nassau"));
        countryList.add(new Country("Barbados", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Flag_of_Barbados.svg/1280px-Flag_of_Barbados.svg.png", "Bridjtaun"));
        countryList.add(new Country("Baliz", "https://www.flagistrany.ru/data/flags/normal/bz.png", "Belmopan"));
        countryList.add(new Country("Grenada", "https://regnum.ru/uploads/pictures/news/2016/04/07/regnum_picture_14599977181024427_normal.jpg", "Send-Djordjes"));
        countryList.add(new Country("Gvatemala", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Flag_of_Guatemala.svg/1200px-Flag_of_Guatemala.svg.png", "Gvatemala"));
        countryList.add(new Country("Gonduras", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Flag_of_Honduras.svg/500px-Flag_of_Honduras.svg.png", "Tegusigalpa"));
        countryList.add(new Country("Dominika", "https://zname.com.ua/watermark/watermark.php?image=https://zname.com.ua/image/cache/catalog/content/Flagi-mira/Dominica_2x3-800x533.jpg", "Rozo"));
        countryList.add(new Country("Kosta-Rika", "https://upload.wikimedia.org/wikipedia/commons/b/bc/Flag_of_Costa_Rica_%28state%29.svg", "San-Hose"));
        countryList.add(new Country("Kuba", "https://img.freepik.com/premium-vector/flag-of-cuba-background_19426-624.jpg", "Gavana"));
        countryList.add(new Country("Mexico", "https://www.flagistrany.ru/data/flags/ultra/mx.png", "Mexico"));
    }

    private void loadSouthAmerica() {
        countryList = new ArrayList<>();

        countryList.add(new Country("Argentina", "https://upload.wikimedia.org/wikipedia/commons/1/1a/Flag_of_Argentina.svg", "Buenos Aires"));
        countryList.add(new Country("Paraguay", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Flag_of_Paraguay.svg/640px-Flag_of_Paraguay.svg.png", "Asuncion"));
        countryList.add(new Country("Bolivia", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Flag_of_Bolivia_%28state%29.svg/500px-Flag_of_Bolivia_%28state%29.svg.png", ""));
        countryList.add(new Country("Brazil", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/800px-Flag_of_Brazil.svg.png", "Brazilia"));
        countryList.add(new Country("Colombia", "https://img.freepik.com/free-photo/flag-of-colombia_1401-90.jpg", "Bogota"));
        countryList.add(new Country("Peru", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1200px-Flag_of_Peru_%28state%29.svg.png", "Lima"));
        countryList.add(new Country("Uruguay", "https://upload.wikimedia.org/wikipedia/commons/f/fe/Flag_of_Uruguay.svg", "Mantevideo"));
        countryList.add(new Country("Chili", "https://hasta-pronto.ru/wp-content/uploads/2016/06/bandera-de-chile-1.jpg", "Santiago"));
        countryList.add(new Country("Ecuador", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Flag_of_Ecuador.svg/1200px-Flag_of_Ecuador.svg.png", "Kito"));
        countryList.add(new Country("Venezuela", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/1200px-Flag_of_Venezuela.svg.png", "Karakas"));

    }

    private void loadEurasia() {
        countryList = new ArrayList<>();

        countryList.add(new Country("Abkhazia", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/Flag_of_the_Republic_of_Abkhazia.svg/250px-Flag_of_the_Republic_of_Abkhazia.svg.png", "Sukhum"));
        countryList.add(new Country("Austria", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Flag_of_Austria.svg/250px-Flag_of_Austria.svg.png", "Vena"));
        countryList.add(new Country("Azerbaidjan", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Flag_of_South_Azerbaijan.svg/210px-Flag_of_South_Azerbaijan.svg.png", "Baku"));
        countryList.add(new Country("Albania", "https://i.pinimg.com/originals/0b/85/d2/0b85d2043f87b0e95efb66d7886feb86.png", "Tirana"));
        countryList.add(new Country("Armenia", "https://www.advantour.com/img/armenia/images/flag.jpg", "Erevan"));
        countryList.add(new Country("Bakhrein", "https://img.freepik.com/premium-photo/bahrain-national-fabric-flag-textile-background-symbol-of-international-asian-world-country_113767-2626.jpg", "Manama"));
        countryList.add(new Country("Bangladesh", "https://upload.wikimedia.org/wikipedia/commons/f/f9/Flag_of_Bangladesh.svg", "Dakka"));
        countryList.add(new Country("Auganistan", "data:image/png;base64,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", "Kabul"));
        countryList.add(new Country("Belarussa", "data:image/png;base64,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", "Minsk"));
        countryList.add(new Country("Dania", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Flag_of_Denmark.svg/250px-Flag_of_Denmark.svg.png", "Kopengagen"));

    }

    private void loadAustralia() {
        countryList = new ArrayList<>();

        countryList.add(new Country("South Wales", "https://thumbs.dreamstime.com/b/%D1%84%D0%BB%D0%B0%D0%B3-%D1%88%D1%82%D0%B0%D1%82%D0%B0-%D0%BD%D0%BE%D0%B2%D1%8B%D0%B9-%D1%8E%D0%B6%D0%BD%D1%8B%D0%B9-%D1%83%D1%8D%D0%BB%D1%8C%D1%81-%D0%BD%D0%BE%D0%B2%D0%BE%D0%B3%D0%BE-%D1%8E%D0%B6%D0%BD%D0%BE%D0%B3%D0%BE-%D1%83%D1%8D%D0%BB%D1%8C%D1%81%D0%B0-%D0%BD%D1%8E%D1%83-%D0%B3%D0%BE%D1%81%D1%83%D0%B4%D0%B0%D1%80%D1%81%D1%82%D0%B2%D0%BE-%D0%BD%D0%B0-168107468.jpg", "Sydney"));
        countryList.add(new Country("Victory", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Flag_of_Victoria_%281870-1877%29.svg/210px-Flag_of_Victoria_%281870-1877%29.svg.png", "MELBOURNE"));
        countryList.add(new Country("Queensled", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Flag_of_Queensland.svg/1280px-Flag_of_Queensland.svg.png", "Brisbane"));
        countryList.add(new Country("West Australia", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%28converted%29.svg/800px-Flag_of_Australia_%28converted%29.svg.png", "Pert"));
        countryList.add(new Country("South Australia", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Flag_of_New_South_Wales.svg/250px-Flag_of_New_South_Wales.svg.png", "Adelaida"));
        countryList.add(new Country("Tasmania", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Flag_of_Tasmania.svg/250px-Flag_of_Tasmania.svg.png", "Hobart"));
        countryList.add(new Country("Northern Territory", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Flag_of_the_Northwest_Territories.svg/250px-Flag_of_the_Northwest_Territories.svg.png", "Darvin"));

    }

    private void loadAfrica() {
        countryList = new ArrayList<>();
        countryList.add(new Country("Nigeria", "https://simvolplus.ru/upload/iblock/309/3095b7f3469d923e20c2a39eadb066b8.jpg", "Abudga"));
        countryList.add(new Country("Kenia", "https://i.lb.ua/030/35/phpR4p5JBMdDi.jpg", "Nairobi"));
        countryList.add(new Country("Ganna", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Flag_of_Ghana.svg/500px-Flag_of_Ghana.svg.png", "Akkra"));
        countryList.add(new Country("DrKongo", "https://st4.depositphotos.com/11351024/25102/i/600/depositphotos_251021424-stock-photo-democratic-republic-of-the-congo.jpg", "Kinshasa"));
        countryList.add(new Country("Mali", "https://images.prom.ua/1321093124_flag-mali.jpg", "Bamako"));
        countryList.add(new Country("Tanzania", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Flag_of_Tanzania.svg/640px-Flag_of_Tanzania.svg.png", "Dodoma"));
        countryList.add(new Country("Senegal", "https://flags-world.com/wp-content/uploads/2021/01/flag-senegala-5.png", "Dakar"));
        countryList.add(new Country("Sudan", "https://upload.wikimedia.org/wikipedia/commons/0/01/Flag_of_Sudan.svg", "Hartum"));
        countryList.add(new Country("Liberia", "https://www.flagistrany.ru/data/flags/ultra/lr.png", "Tripoli"));
        countryList.add(new Country("Niger", "https://astelus.com/wp-content/viajes/bandera-de-niger-1152x759.png", "Niamey"));
    }
}